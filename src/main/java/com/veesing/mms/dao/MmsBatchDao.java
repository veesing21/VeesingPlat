package com.veesing.mms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.mms.domain.MmsBatchDO;

@Mapper
public interface MmsBatchDao {

	MmsBatchDO get(long id);

	List<MmsBatchDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);
}
