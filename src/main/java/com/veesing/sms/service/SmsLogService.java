package com.veesing.sms.service;

import com.veesing.sms.domain.SmsBatchDO;
import com.veesing.sms.domain.SmsReplyDO;
import com.veesing.sms.domain.SmsSentDO;

import java.util.List;
import java.util.Map;

public interface SmsLogService {

    List<SmsBatchDO> listBatch(Map<String, Object> map);

    int countBatch(Map<String, Object> map);

    List<SmsSentDO> listSent(Map<String, Object> map);

    int countSent(Map<String, Object> map);

    SmsBatchDO getBatch(Long id);

    List<SmsReplyDO> listReply(Map<String, Object> map);

    int countReply(Map<String, Object> map);
}
