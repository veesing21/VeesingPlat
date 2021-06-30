package com.veesing.trigmsg.service;

import java.util.List;
import java.util.Map;

import com.veesing.trigmsg.domain.SysTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import com.veesing.trigmsg.domain.TemplateDO;

public interface TrigmsgTemplateService {

    List<TemplateDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    TemplateDO get(Long id);

    List<SysTemplateTypeDO> listTemplateTypes();

    List<SysTemplateDO> listSysTemplates(Map<String, Object> map);

    int countSysTemplates(Map<String, Object> map);


}
