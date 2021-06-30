package com.veesing.system.dao;

import com.veesing.system.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {

	UserDO getByUsername(String username);

}
