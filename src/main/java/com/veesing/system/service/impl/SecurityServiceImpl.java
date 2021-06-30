package com.veesing.system.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.system.dao.SecurityDao;
import com.veesing.system.domain.SecurityDO;
import com.veesing.system.service.SecurityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SecurityServiceImpl implements SecurityService {

	SecurityDao securityMapper;

	public SecurityServiceImpl(SecurityDao securityMapper) {
		this.securityMapper = securityMapper;
	}

	@Override
	public String list(Integer pdType) {
		List<SecurityDO> list = securityMapper.list(ShiroUtils.getCustomerId(), pdType);
		JSONObject obj = new JSONObject();
		for (SecurityDO s : list) {
			String key = s.getKey();
			obj.put(key, s);
		}
		return obj.toJSONString();
	}





}
