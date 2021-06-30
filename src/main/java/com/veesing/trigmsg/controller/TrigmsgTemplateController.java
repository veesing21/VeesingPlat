package com.veesing.trigmsg.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.trigmsg.domain.SysTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import com.veesing.trigmsg.domain.TemplateDO;
import com.veesing.trigmsg.service.TrigmsgTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/trigmsg/template")
public class TrigmsgTemplateController {

    TrigmsgTemplateService trigmsgTemplateService;

    public TrigmsgTemplateController(TrigmsgTemplateService trigmsgTemplateService) {
        this.trigmsgTemplateService = trigmsgTemplateService;
    }

    @GetMapping("/list")
    PageUtils list(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        return new PageUtils(trigmsgTemplateService.list(query), trigmsgTemplateService.count(query));
    }

    @PostMapping("/save")
    R save(TemplateDO template, HttpServletRequest request) {
        return R.error("演示版本");
    }

    @GetMapping("/get")
    TemplateDO get(Long id) {
        return trigmsgTemplateService.get(id);
    }

    @PostMapping("/update")
    R update(TemplateDO template) {
        return R.error("演示版本");
    }

    @PostMapping("/remove")
    R remove(long id) {
        return R.error("演示版本");
    }

    @PostMapping("/batchRemove")
    R batchRemove(@RequestParam("ids[]") Long[] ids) {
        return R.error("演示版本");
    }

    @GetMapping("/listTypes")
    List<SysTemplateTypeDO> listTemplateTypes() {
        return trigmsgTemplateService.listTemplateTypes();
    }


    @GetMapping("/listSysTemplates")
    PageUtils listSysTemplates(@RequestParam Map<String, Object> map) {
        Query query = new Query(map);
        return new PageUtils(trigmsgTemplateService.listSysTemplates(query), trigmsgTemplateService.countSysTemplates(query));
    }


    @PostMapping("/useSysTemplate")
    R useSysTemplate(SysTemplateDO sysTemplate) {
        return R.error("演示版本");
    }
}
