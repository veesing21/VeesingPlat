package com.veesing.trigmsg.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.trigmsg.service.TrigmsgLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/trigmsg/log")
public class TrigmsgLogController {

    TrigmsgLogService trigmsgLogService;

    public TrigmsgLogController(TrigmsgLogService trigmsgLogService) {
        this.trigmsgLogService = trigmsgLogService;
    }


    @GetMapping("/list")
    PageUtils list(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        return new PageUtils(trigmsgLogService.list(query), trigmsgLogService.count(query));
    }


    @GetMapping("/reply/list")
    PageUtils listReply(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        return new PageUtils(trigmsgLogService.listReply(query), trigmsgLogService.countReply(query));
    }



}
