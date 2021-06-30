package com.veesing.global.service;

import com.veesing.global.domain.GlobalSmsCodeSentDO;

import java.util.List;
import java.util.Map;


public interface GlobalSmsCodeSentService {

    List<GlobalSmsCodeSentDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

}

