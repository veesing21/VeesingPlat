package com.veesing.trigmsg.dao;

import com.veesing.trigmsg.domain.TrigmsgSentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface TrigmsgSentDao {

    List<TrigmsgSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

}
