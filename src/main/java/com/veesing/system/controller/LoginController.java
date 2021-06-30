package com.veesing.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.veesing.common.controller.BaseController;
import com.veesing.common.domain.Tree;
import com.veesing.common.utils.Md5Utils;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.system.domain.MenuDO;
import com.veesing.system.service.MenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class LoginController extends BaseController {

    MenuService menuService;

    public LoginController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping({"/", "", "/login"})
    String welcome(HttpServletRequest request) {
        return "login";
    }

    @GetMapping({"/index", "/home"})
    String index(HttpServletRequest request) {
        return "client/index";
    }


    @GetMapping("/index/menu")
    @ResponseBody
    List<Tree<MenuDO>> getMenusByLoginUserId() {
        return menuService.listMenuTree(getUserId());
    }

    @PostMapping("/login")
    @ResponseBody
    R ajaxLogin(String username, String password, String pcode, String isregister, HttpServletRequest request) {
        password = Md5Utils.encrypt(username, password);
        HttpSession session = request.getSession();
        Integer loginCount = (Integer) session.getAttribute("loginCount");
        if (loginCount == null) {
            loginCount = 0;
        }
        if (isregister == null) {
            if (loginCount >= 3) {
                String sessionCode = (String) session.getAttribute("code");
                if (!StringUtils.equalsIgnoreCase(pcode, sessionCode) || pcode == null) {
                    return R.error("图形验证码不正确");
                }
            }
        }
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            Session s = subject.getSession();
            s.setAttribute("directLogin", false);
            s.setTimeout(1000 * 60 * 60);
            subject.login(token);
            subject.getSession().setTimeout(1000 * 60 * 60);
            return R.ok();
        } catch (AuthenticationException e) {
            session.setAttribute("loginCount", ++loginCount);
            return R.error(e.getMessage());
        }
    }


    @GetMapping("/logout")
    String logout() {
        ShiroUtils.logout();
        return "redirect:/login";
    }

    @GetMapping("/un_authc")
    @ResponseBody
    R unauthc() {
        return R.error(401, "请登录");
    }

    @GetMapping("/403")
    String error403() {
        return "error/403";
    }

}
