package com.veesing.mms.dao;

import com.veesing.mms.domain.MmsSentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface MmsSentDao {

    List<MmsSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);


}
