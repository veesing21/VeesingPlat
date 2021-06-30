package com.veesing.global.service;

import com.veesing.global.domain.GlobalSmsTemplateDO;

import java.util.List;
import java.util.Map;


public interface GlobalSmsTemplateService {

    List<GlobalSmsTemplateDO> list(Map<String,Object> map);

    int count(Map<String, Object> map);

    GlobalSmsTemplateDO get(Long id);


}
