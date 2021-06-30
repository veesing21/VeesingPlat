package com.veesing.mms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.mms.domain.MmsTemplateDO;


@Mapper
public interface MmsTemplateDao {

    List<MmsTemplateDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    MmsTemplateDO get(long id);

}
