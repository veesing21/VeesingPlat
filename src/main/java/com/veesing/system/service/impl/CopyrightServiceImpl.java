package com.veesing.system.service.impl;

import com.veesing.system.dao.CopyrightDao;
import com.veesing.system.domain.CopyrightDO;
import com.veesing.system.service.CopyrightService;
import org.springframework.stereotype.Service;

@Service
public class CopyrightServiceImpl implements CopyrightService {

	CopyrightDao copyrightMapper;

	public CopyrightServiceImpl(CopyrightDao copyrightMapper) {
		this.copyrightMapper = copyrightMapper;
	}

	@Override
	public CopyrightDO getByCustomerId(Long customerId) {
		return copyrightMapper.getByCustomerId(customerId);
	}

}
