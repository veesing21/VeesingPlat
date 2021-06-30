package com.veesing.trigmsg.service;

import com.veesing.trigmsg.domain.TrigmsgReceivedDO;
import com.veesing.trigmsg.domain.TrigmsgSentDO;

import java.util.List;
import java.util.Map;


public interface TrigmsgLogService {

    List<TrigmsgSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    List<TrigmsgReceivedDO> listReply(Map<String, Object> map);

    int countReply(Map<String, Object> map);

}
