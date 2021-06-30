package com.veesing.trigmsg.service.impl;

import com.veesing.trigmsg.dao.TrigmsgTemplateDao;
import com.veesing.trigmsg.domain.SysTemplateDO;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import com.veesing.trigmsg.domain.TemplateDO;
import com.veesing.trigmsg.service.TrigmsgTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class TrigmsgTemplateServiceImpl implements TrigmsgTemplateService {

    TrigmsgTemplateDao trigmsgTemplateMapper;

    public TrigmsgTemplateServiceImpl(TrigmsgTemplateDao trigmsgTemplateMapper) {
        this.trigmsgTemplateMapper = trigmsgTemplateMapper;
    }

    @Override
    public List<TemplateDO> list(Map<String, Object> map) {
        return trigmsgTemplateMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return trigmsgTemplateMapper.count(map);
    }

    @Override
    public TemplateDO get(Long id) {
        return trigmsgTemplateMapper.get(id);
    }

    @Override
    public List<SysTemplateTypeDO> listTemplateTypes() {
        return trigmsgTemplateMapper.listTemplateTypes();
    }

    @Override
    public List<SysTemplateDO> listSysTemplates(Map<String, Object> map) {
        return trigmsgTemplateMapper.listSysTemplates(map);
    }

    @Override
    public int countSysTemplates(Map<String, Object> map) {
        return trigmsgTemplateMapper.countSysTemplates(map);
    }


}
