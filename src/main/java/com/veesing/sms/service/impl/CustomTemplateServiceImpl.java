package com.veesing.sms.service.impl;

import com.veesing.sms.dao.CustomTemplateDao;
import com.veesing.sms.domain.CustomTemplateDO;
import com.veesing.sms.service.CustomTemplateService;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CustomTemplateServiceImpl implements CustomTemplateService {

	CustomTemplateDao customTemplateMapper;

	public CustomTemplateServiceImpl(CustomTemplateDao customTemplateMapper) {
		this.customTemplateMapper = customTemplateMapper;
	}

	@Override
	public List<CustomTemplateDO> list(Map<String, Object> map) {
		return customTemplateMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return customTemplateMapper.count(map);
	}

	@Override
	public CustomTemplateDO get(Long id) {
		return customTemplateMapper.get(id);
	}

	@Override
	public List<SysTemplateTypeDO> listTemplateTypes() {
		return customTemplateMapper.listTemplateTypes();
	}


}
