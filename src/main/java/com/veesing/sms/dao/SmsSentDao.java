package com.veesing.sms.dao;

import com.veesing.sms.domain.SmsSentDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface SmsSentDao {

    List<SmsSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    List<String> getPhoneByWeek(@Param("num") int num, @Param("customerId") long customerId);

}
