package com.veesing.sms.dao;

import com.veesing.sms.domain.SmsReplyDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SmsReplyDao {

    List<SmsReplyDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);


}
