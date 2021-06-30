package com.veesing.system.service;

import java.util.List;
import java.util.Set;

import com.veesing.common.domain.Tree;
import com.veesing.system.domain.MenuDO;


public interface MenuService {

	List<Tree<MenuDO>> listMenuTree(Long id);

	Set<String> listPerms(Long userId);

}
