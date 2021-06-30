package com.veesing.customer.controller;

import com.veesing.common.utils.ShiroUtils;
import com.veesing.customer.domain.CustomerDO;
import com.veesing.customer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/current")
    CustomerDO getCurrentCustomer() {
        CustomerDO customer = customerService.get(ShiroUtils.getCustomerId());
        customer.setAppKey("******");
        return customer;
    }


}
