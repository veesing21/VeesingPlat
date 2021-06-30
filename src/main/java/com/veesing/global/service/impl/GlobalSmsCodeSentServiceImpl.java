package com.veesing.global.service.impl;

import com.veesing.global.dao.GlobalSmsCodeSentDao;
import com.veesing.global.domain.GlobalSmsCodeSentDO;
import com.veesing.global.service.GlobalSmsCodeSentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class GlobalSmsCodeSentServiceImpl implements GlobalSmsCodeSentService {

    GlobalSmsCodeSentDao globalSmsCodeSentMapper;

    public GlobalSmsCodeSentServiceImpl(GlobalSmsCodeSentDao globalSmsCodeSentMapper) {
        this.globalSmsCodeSentMapper = globalSmsCodeSentMapper;
    }

    @Override
    public List<GlobalSmsCodeSentDO> list(Map<String, Object> map) {
        return globalSmsCodeSentMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return globalSmsCodeSentMapper.count(map);
    }

}
