package com.veesing.system.dao;

import com.veesing.system.domain.MenuDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao {

	List<MenuDO> listMenuByUserId(Long id);

	List<String> listUserPerms(Long id);

}
