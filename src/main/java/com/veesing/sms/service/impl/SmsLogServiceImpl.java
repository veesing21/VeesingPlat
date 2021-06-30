package com.veesing.sms.service.impl;

import com.veesing.sms.dao.SmsBatchDao;
import com.veesing.sms.dao.SmsReplyDao;
import com.veesing.sms.dao.SmsSentDao;
import com.veesing.sms.domain.SmsBatchDO;
import com.veesing.sms.domain.SmsReplyDO;
import com.veesing.sms.domain.SmsSentDO;
import com.veesing.sms.service.SmsLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsLogServiceImpl implements SmsLogService {

    SmsBatchDao smsBatchMapper;

    SmsSentDao smsSentMapper;

    SmsReplyDao smsReceivedMapper;

    public SmsLogServiceImpl(SmsBatchDao smsBatchMapper, SmsSentDao smsSentMapper, SmsReplyDao smsReceivedMapper) {
        this.smsBatchMapper = smsBatchMapper;
        this.smsSentMapper = smsSentMapper;
        this.smsReceivedMapper = smsReceivedMapper;
    }

    @Override
    public List<SmsBatchDO> listBatch(Map<String, Object> map) {
        return smsBatchMapper.list(map);
    }

    @Override
    public int countBatch(Map<String, Object> map) {
        return smsBatchMapper.count(map);
    }

    @Override
    public List<SmsSentDO> listSent(Map<String, Object> map) {
        return smsSentMapper.list(map);
    }

    @Override
    public int countSent(Map<String, Object> map) {
        return smsSentMapper.count(map);
    }



    @Override
    public SmsBatchDO getBatch(Long id) {
        return smsBatchMapper.get(id);
    }

    @Override
    public List<SmsReplyDO> listReply(Map<String, Object> map) {
        return smsReceivedMapper.list(map);
    }

    @Override
    public int countReply(Map<String, Object> map) {
        return smsReceivedMapper.count(map);
    }


}
