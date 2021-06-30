package com.veesing.global.service.impl;

import com.veesing.global.dao.GlobalSmsCodeReceivedDao;
import com.veesing.global.domain.GlobalSmsCodeReceivedDO;
import com.veesing.global.service.GlobalSmsCodeReceivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class GlobalSmsCodeReceivedServiceImpl implements GlobalSmsCodeReceivedService {

    GlobalSmsCodeReceivedDao globalSmsCodeReceivedMapper;

    public GlobalSmsCodeReceivedServiceImpl(GlobalSmsCodeReceivedDao globalSmsCodeReceivedMapper) {
        this.globalSmsCodeReceivedMapper = globalSmsCodeReceivedMapper;
    }

    @Override
    public List<GlobalSmsCodeReceivedDO> list(Map<String, Object> map) {
        return globalSmsCodeReceivedMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return globalSmsCodeReceivedMapper.count(map);
    }


}
