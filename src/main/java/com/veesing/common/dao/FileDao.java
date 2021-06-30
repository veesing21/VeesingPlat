package com.veesing.common.dao;

import com.veesing.common.domain.FileDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FileDao {

	FileDO get(Long id);

	List<FileDO> list(Map<String,Object> map);

	int count(Map<String,Object> map);

	int save(FileDO file);

	int update(FileDO file);

	int remove(Long id);

	int batchRemove(Long[] ids);
}
