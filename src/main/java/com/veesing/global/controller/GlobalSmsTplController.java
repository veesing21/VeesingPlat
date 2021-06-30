package com.veesing.global.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.global.domain.GlobalSmsTemplateDO;
import com.veesing.global.service.GlobalSmsTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/globalSmsCode/template")
public class GlobalSmsTplController {

    GlobalSmsTemplateService globalSmsTemplateService;

    public GlobalSmsTplController(GlobalSmsTemplateService globalSmsTemplateService) {
        this.globalSmsTemplateService = globalSmsTemplateService;
    }

    @RequestMapping("/save")
    public R createTemplate(GlobalSmsTemplateDO templateDo, HttpServletRequest request) {
        return R.error("演示版本");
    }


    @GetMapping("/list")
    PageUtils list(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        List<GlobalSmsTemplateDO> templateList = globalSmsTemplateService.list(query);
        int total = globalSmsTemplateService.count(query);
        return new PageUtils(templateList, total);
    }

    @GetMapping("/get")
    GlobalSmsTemplateDO get(Long id) {
        return globalSmsTemplateService.get(id);
    }


    @PostMapping("/update")
    R update(GlobalSmsTemplateDO template) {
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

}
