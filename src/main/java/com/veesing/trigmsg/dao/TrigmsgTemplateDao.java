package com.veesing.trigmsg.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.trigmsg.domain.SysTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import com.veesing.trigmsg.domain.TemplateDO;

@Mapper
public interface TrigmsgTemplateDao {

	List<TemplateDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	TemplateDO get(Long id);

	List<SysTemplateTypeDO> listTemplateTypes();

	List<SysTemplateDO> listSysTemplates(Map<String, Object> map);

	int countSysTemplates(Map<String, Object> map);

}
