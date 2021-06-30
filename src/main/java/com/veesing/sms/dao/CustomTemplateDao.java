package com.veesing.sms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.sms.domain.CustomTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;

@Mapper
public interface CustomTemplateDao {
	CustomTemplateDO get(Long id);

	List<CustomTemplateDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	List<SysTemplateTypeDO> listTemplateTypes();


}
