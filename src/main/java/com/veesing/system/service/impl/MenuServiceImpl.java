package com.veesing.system.service.impl;

import com.veesing.common.domain.Tree;
import com.veesing.common.utils.BuildTree;
import com.veesing.system.dao.MenuDao;
import com.veesing.system.domain.MenuDO;
import com.veesing.system.service.MenuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class MenuServiceImpl implements MenuService {

	MenuDao menuMapper;

	public MenuServiceImpl(MenuDao menuMapper) {
		this.menuMapper = menuMapper;
	}

	@Override
	public Set<String> listPerms(Long userId) {
		List<String> perms = menuMapper.listUserPerms(userId);
		Set<String> permsSet = new HashSet<>();
		for (String perm : perms) {
			if (StringUtils.isNotBlank(perm)) {
				permsSet.addAll(Arrays.asList(perm.trim().split(",")));
			}
		}
		return permsSet;
	}

	@Override
	public List<Tree<MenuDO>> listMenuTree(Long id) {
		List<Tree<MenuDO>> trees = new ArrayList<>();
		List<MenuDO> menus = menuMapper.listMenuByUserId(id);
		for (MenuDO sysMenuDO : menus) {
			Tree<MenuDO> tree = new Tree<>();
			tree.setId(sysMenuDO.getMenuId().toString());
			tree.setParentId(sysMenuDO.getParentId().toString());
			tree.setText(sysMenuDO.getName());
			Map<String, Object> attributes = new HashMap<>(4);
			attributes.put("url", sysMenuDO.getUrl());
			attributes.put("icon", sysMenuDO.getIcon());
			tree.setAttributes(attributes);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		return BuildTree.buildList(trees, "0");
	}

}
