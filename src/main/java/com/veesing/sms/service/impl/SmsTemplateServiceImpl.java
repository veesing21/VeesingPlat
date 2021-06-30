package com.veesing.sms.service.impl;

import com.veesing.sms.dao.SmsTemplateDao;
import com.veesing.sms.domain.SmsTemplateDO;
import com.veesing.sms.service.SmsTemplateService;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class SmsTemplateServiceImpl implements SmsTemplateService {

	SmsTemplateDao smsTemplateMapper;

	public SmsTemplateServiceImpl(SmsTemplateDao smsTemplateMapper) {
		this.smsTemplateMapper = smsTemplateMapper;
	}

	@Override
	public List<SmsTemplateDO> list(Map<String, Object> map) {
		return smsTemplateMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return smsTemplateMapper.count(map);
	}

	@Override
	public SmsTemplateDO get(Long id) {
		return smsTemplateMapper.get(id);
	}

	@Override
	public List<SysTemplateTypeDO> listTemplateTypes() {
		return smsTemplateMapper.listTemplateTypes();
	}

}
