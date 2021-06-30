package com.veesing.global.dao;

import com.veesing.global.domain.GlobalSmsTemplateDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface GlobalSmsTemplateDao {

    List<GlobalSmsTemplateDO> list(Map<String,Object> map);


    int count(Map<String, Object> map);

    GlobalSmsTemplateDO get(Long id);
}
