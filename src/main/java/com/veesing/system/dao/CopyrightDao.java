package com.veesing.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.system.domain.CopyrightDO;

@Mapper
public interface CopyrightDao {

	CopyrightDO getByCustomerId(Long customerId);

}
