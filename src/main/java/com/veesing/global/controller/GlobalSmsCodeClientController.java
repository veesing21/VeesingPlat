package com.veesing.global.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.global.domain.GlobalSmsCodeReceivedDO;
import com.veesing.global.domain.GlobalSmsCodeSentDO;
import com.veesing.global.service.GlobalSmsCodeReceivedService;
import com.veesing.global.service.GlobalSmsCodeSentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/globalSmsCode")
public class GlobalSmsCodeClientController {
    GlobalSmsCodeSentService globalSmsCodeSentService;
    GlobalSmsCodeReceivedService globalSmsCodeReceivedService;

    public GlobalSmsCodeClientController(GlobalSmsCodeSentService globalSmsCodeSentService, GlobalSmsCodeReceivedService globalSmsCodeReceivedService) {
        this.globalSmsCodeSentService = globalSmsCodeSentService;
        this.globalSmsCodeReceivedService = globalSmsCodeReceivedService;
    }

    @GetMapping("/sent/list")
    PageUtils list(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        List<GlobalSmsCodeSentDO> list = globalSmsCodeSentService.list(query);
        int total = globalSmsCodeSentService.count(query);
        return new PageUtils(list, total);
    }


    @GetMapping("/receipt/list")
    PageUtils listReceipt(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        List<GlobalSmsCodeSentDO> list = globalSmsCodeSentService.list(query);
        int total = globalSmsCodeSentService.count(query);
        return new PageUtils(list, total);
    }


    @RequestMapping("/received/list")
    PageUtils listReceived(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        List<GlobalSmsCodeReceivedDO> list = globalSmsCodeReceivedService.list(query);
        int total = globalSmsCodeReceivedService.count(query);
        return new PageUtils(list, total);
    }

    @RequestMapping("/receipt/export")
    public void receiptExport(HttpServletResponse res, @RequestParam Map<String, Object> map) {

    }

    @RequestMapping("/received/export")
    public void receivedExport(HttpServletResponse res, @RequestParam Map<String, Object> map) {

    }


}
