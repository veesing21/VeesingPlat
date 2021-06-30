package com.veesing.sms.service;

import java.util.List;
import java.util.Map;

import com.veesing.sms.domain.CustomTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;

public interface CustomTemplateService {

	List<CustomTemplateDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	CustomTemplateDO get(Long id);

	List<SysTemplateTypeDO> listTemplateTypes();



}
