package com.veesing.trigmsg.service.impl;

import com.veesing.trigmsg.dao.TrigmsgReceivedDao;
import com.veesing.trigmsg.dao.TrigmsgSentDao;
import com.veesing.trigmsg.domain.TrigmsgReceivedDO;
import com.veesing.trigmsg.domain.TrigmsgSentDO;
import com.veesing.trigmsg.service.TrigmsgLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrigmsgLogServiceImpl implements TrigmsgLogService {

    TrigmsgSentDao trigmsgSentMapper;

    TrigmsgReceivedDao trigmsgReceivedMapper;

    public TrigmsgLogServiceImpl(TrigmsgSentDao trigmsgSentMapper, TrigmsgReceivedDao trigmsgReceivedMapper) {
        this.trigmsgSentMapper = trigmsgSentMapper;
        this.trigmsgReceivedMapper = trigmsgReceivedMapper;
    }

    @Override
    public List<TrigmsgSentDO> list(Map<String, Object> map) {
        return trigmsgSentMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return trigmsgSentMapper.count(map);
    }

    @Override
    public List<TrigmsgReceivedDO> listReply(Map<String, Object> map) {
        return trigmsgReceivedMapper.list(map);
    }

    @Override
    public int countReply(Map<String, Object> map) {
        return trigmsgReceivedMapper.count(map);
    }




}
