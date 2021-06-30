package com.veesing.sms.service;

import java.util.List;
import java.util.Map;

import com.veesing.sms.domain.SmsTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;

public interface SmsTemplateService {

	List<SmsTemplateDO> list(Map<String, Object> map);

	int count(Map<String, Object> params);

	SmsTemplateDO get(Long id);

	List<SysTemplateTypeDO> listTemplateTypes();



}
