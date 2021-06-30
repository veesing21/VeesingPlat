package com.veesing.sms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.veesing.sms.domain.SmsBatchDO;

@Mapper
public interface SmsBatchDao {

    List<SmsBatchDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    SmsBatchDO get(long id);

}
