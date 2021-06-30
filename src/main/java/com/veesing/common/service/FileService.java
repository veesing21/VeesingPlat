package com.veesing.common.service;

import com.veesing.common.domain.FileDO;

import java.util.List;
import java.util.Map;

public interface FileService {

	FileDO get(Long id);

	List<FileDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(FileDO sysFile);

	int update(FileDO sysFile);

	int remove(Long id);

	int batchRemove(Long[] ids);
}
