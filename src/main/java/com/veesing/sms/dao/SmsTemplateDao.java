package com.veesing.sms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.sms.domain.SmsTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;

@Mapper
public interface SmsTemplateDao {

	List<SmsTemplateDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	SmsTemplateDO get(Long id);

	List<SysTemplateTypeDO> listTemplateTypes();

}
