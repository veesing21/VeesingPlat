package com.veesing.common.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.veesing.common.domain.LogDO;

@Service
public interface LogService {

	List<LogDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int remove(Long id);

	int batchRemove(Long[] ids);
}
