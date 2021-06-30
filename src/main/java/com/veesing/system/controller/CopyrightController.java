package com.veesing.system.controller;

import com.veesing.common.utils.ShiroUtils;
import com.veesing.system.domain.CopyrightDO;
import com.veesing.system.service.CopyrightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sys/copyright")
public class CopyrightController {

    CopyrightService copyrightService;

    public CopyrightController(CopyrightService copyrightService) {
        this.copyrightService = copyrightService;
    }

    @GetMapping("/get")
    CopyrightDO getByCustomerId() {
        return copyrightService.getByCustomerId(ShiroUtils.getCustomerId());
    }


}
