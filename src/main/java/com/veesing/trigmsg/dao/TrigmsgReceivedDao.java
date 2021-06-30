package com.veesing.trigmsg.dao;

import com.veesing.trigmsg.domain.TrigmsgReceivedDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface TrigmsgReceivedDao {

    List<TrigmsgReceivedDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

}
