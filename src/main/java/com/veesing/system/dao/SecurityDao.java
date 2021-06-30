package com.veesing.system.dao;

import com.veesing.system.domain.SecurityDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface SecurityDao {

	List<SecurityDO> list(@Param("customerId") Long customerId, @Param("pdType") Integer pdType);

}
