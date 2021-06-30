package com.veesing.customer.service.impl;


import com.veesing.customer.dao.CustomerDao;
import com.veesing.customer.domain.CustomerDO;
import com.veesing.customer.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerMapper;

    public CustomerServiceImpl(CustomerDao customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDO get(long id) {
        return customerMapper.get(id);
    }


}
