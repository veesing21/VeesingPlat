package com.veesing.common.controller;

import com.veesing.common.domain.LogDO;
import com.veesing.common.service.LogService;
import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RequestMapping("/common/log")
@RestController
public class LogController {
    LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    String prefix = "common/log";


    @GetMapping("/list")
    PageUtils list(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<LogDO> list = logService.list(query);
        int count = logService.count(query);
        return new PageUtils(list, count);
    }

    @PostMapping("/remove")
    R remove(Long id) {
        if (logService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("/batchRemove")
    R batchRemove(@RequestParam("ids[]") Long[] ids) {
        int r = logService.batchRemove(ids);
        if (r > 0) {
            return R.ok();
        }
        return R.error();
    }
}
