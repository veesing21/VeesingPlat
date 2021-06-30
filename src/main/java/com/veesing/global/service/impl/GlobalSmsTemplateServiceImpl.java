package com.veesing.global.service.impl;

import com.veesing.global.dao.GlobalSmsTemplateDao;
import com.veesing.global.domain.GlobalSmsTemplateDO;
import com.veesing.global.service.GlobalSmsTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class GlobalSmsTemplateServiceImpl implements GlobalSmsTemplateService {

    GlobalSmsTemplateDao globalSmsTemplateDao;


    public GlobalSmsTemplateServiceImpl(GlobalSmsTemplateDao globalSmsTemplateDao) {
        this.globalSmsTemplateDao = globalSmsTemplateDao;
    }

    @Override
    public List<GlobalSmsTemplateDO> list(Map<String, Object> map) {
        return globalSmsTemplateDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return globalSmsTemplateDao.count(map);
    }

    @Override
    public GlobalSmsTemplateDO get(Long id) {
        return globalSmsTemplateDao.get(id);
    }


}
