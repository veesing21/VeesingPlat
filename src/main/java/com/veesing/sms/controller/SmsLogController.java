package com.veesing.sms.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.sms.service.SmsLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/sms/log")
public class SmsLogController {

    SmsLogService smsLogService;

    public SmsLogController(SmsLogService smsLogService) {
        this.smsLogService = smsLogService;
    }

    @RequestMapping("/batch/list")
    PageUtils listBatch(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        return new PageUtils(smsLogService.listBatch(query), smsLogService.countBatch(query));
    }

    @GetMapping("/receipt/list")
    PageUtils listReceipt(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        return new PageUtils(smsLogService.listSent(query), smsLogService.countSent(query));
    }

    @GetMapping("/reply/list")
    PageUtils listReply(@RequestParam Map<String, Object> params) {
        params.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(params);
        return new PageUtils(smsLogService.listReply(query), smsLogService.countReply(query));
    }

    @RequestMapping("/batch/phone/export")
    void downPhone(HttpServletResponse res, long id) {
    }

    @RequestMapping("/receipt/export")
    void downReceipt(HttpServletResponse res, @RequestParam Map<String, Object> map) {
    }

    @RequestMapping("/reply/export")
    void downReply(HttpServletResponse res, @RequestParam Map<String, Object> map) {
    }

}
