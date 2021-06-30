package com.veesing.global.dao;


import com.veesing.global.domain.GlobalSmsCodeSentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GlobalSmsCodeSentDao {

    List<GlobalSmsCodeSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);


}
