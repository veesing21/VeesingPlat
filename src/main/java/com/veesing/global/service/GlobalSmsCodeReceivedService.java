package com.veesing.global.service;

import com.veesing.global.domain.GlobalSmsCodeReceivedDO;

import java.util.List;
import java.util.Map;


public interface GlobalSmsCodeReceivedService {

	List<GlobalSmsCodeReceivedDO> list(Map<String, Object> params);

	int count(Map<String, Object> params);

}
