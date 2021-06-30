package com.veesing.common.utils;

import com.veesing.customer.domain.CustomerDO;
import com.veesing.customer.service.CustomerService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.veesing.system.domain.UserDO;

public class ShiroUtils {

    public static Subject getSubjct() {
        return SecurityUtils.getSubject();
    }

    public static UserDO getUser() {
        return (UserDO) getSubjct().getPrincipal();
    }

    public static Long getUserId() {
        return getUser().getUserId();
    }

    public static void logout() {
        getSubjct().logout();
    }

    public static Long getCustomerId() {
        return getUser().getCustomerId();
    }

    public static CustomerDO getCustomer() {
        CustomerService customerService = SpringContextHolder.getBean(CustomerService.class);
        return customerService.get(getCustomerId());
    }
}
