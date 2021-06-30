package com.veesing.system.controller;

import com.veesing.common.utils.R;
import com.veesing.customer.domain.CustomerDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/account")
public class AccountController {

    @PostMapping("/update")
    R update(CustomerDO customer) {
       return R.error("演示版本");
    }

    @PostMapping("/supply")
    R supply(CustomerDO customer) {
        return R.error("演示版本");
    }

}
