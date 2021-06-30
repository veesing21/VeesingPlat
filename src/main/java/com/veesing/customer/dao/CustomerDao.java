package com.veesing.customer.dao;


import org.apache.ibatis.annotations.Mapper;

import com.veesing.customer.domain.CustomerDO;

@Mapper
public interface CustomerDao {


    CustomerDO get(long id);


}
