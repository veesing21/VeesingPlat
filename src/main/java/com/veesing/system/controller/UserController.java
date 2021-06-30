package com.veesing.system.controller;

import com.veesing.common.utils.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RequestMapping("/sys/user")
@RestController
public class UserController  {

	@PostMapping("/sendvcode")
	R yanzheng(String phone, String code, HttpServletRequest req) {
		return R.error("演示版本");
	}

	@PostMapping("/resetpwd")
	R resetPwd(String pwd, String phone, String vcode, HttpServletRequest req) {
		return R.error("演示版本");
	}

}
