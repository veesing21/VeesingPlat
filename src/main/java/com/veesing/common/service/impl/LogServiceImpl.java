package com.veesing.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veesing.common.dao.LogDao;
import com.veesing.common.domain.LogDO;
import com.veesing.common.service.LogService;

@Service
public class LogServiceImpl implements LogService {

	LogDao logMapper;

	public LogServiceImpl(LogDao logMapper) {
		this.logMapper = logMapper;
	}

	@Override
	public List<LogDO> list(Map<String, Object> map) {
		return logMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return logMapper.count(map);
	}

	@Override
	public int remove(Long id) {
		int count = logMapper.remove(id);
		return count;
	}

	@Override
	public int batchRemove(Long[] ids){
		return logMapper.batchRemove(ids);
	}
}
