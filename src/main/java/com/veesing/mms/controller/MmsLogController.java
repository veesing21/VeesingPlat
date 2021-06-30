package com.veesing.mms.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.mms.service.MmsLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/mms/log")
public class MmsLogController {

    MmsLogService mmsLogService;

    public MmsLogController(MmsLogService mmsLogService) {
        this.mmsLogService = mmsLogService;
    }

    @GetMapping("/batch/list")
    public PageUtils listBatch(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        return new PageUtils(mmsLogService.listBatch(query), mmsLogService.countBatch(query));
    }

    @GetMapping("/receipt/list")
    public PageUtils listSent(@RequestParam Map<String, Object> map) {
        map.put("customerId", ShiroUtils.getCustomerId());
        Query query = new Query(map);
        return new PageUtils(mmsLogService.listSent(query), mmsLogService.countSent(query));
    }

    @RequestMapping("/receipt/export")
    public void receiptExport(HttpServletResponse res, @RequestParam Map<String, Object> map) {

    }

    @RequestMapping("/batch/phone/export")
    public void download(HttpServletResponse res, long id) {
    }

}
