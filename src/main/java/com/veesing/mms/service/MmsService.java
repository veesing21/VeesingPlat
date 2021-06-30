package com.veesing.mms.service;

import com.veesing.mms.domain.MmsTemplateDO;

import java.util.List;
import java.util.Map;


public interface MmsService {

	List<MmsTemplateDO> listTemplate(Map<String, Object> map);

	int countTemplate(Map<String, Object> map);

}
