package com.veesing.mms.service.impl;

import com.veesing.mms.dao.MmsTemplateDao;
import com.veesing.mms.domain.MmsTemplateDO;
import com.veesing.mms.service.MmsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MmsServiceImpl implements MmsService {

    MmsTemplateDao mmsTemplateMapper;

    public MmsServiceImpl(MmsTemplateDao mmsTemplateMapper) {
        this.mmsTemplateMapper = mmsTemplateMapper;
    }

    @Override
    public List<MmsTemplateDO> listTemplate(Map<String, Object> map) {
        return mmsTemplateMapper.list(map);
    }

    @Override
    public int countTemplate(Map<String, Object> map) {
        return mmsTemplateMapper.count(map);
    }

}
