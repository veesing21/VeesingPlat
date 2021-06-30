package com.veesing.mms.service;

import com.veesing.mms.domain.MmsBatchDO;
import com.veesing.mms.domain.MmsSentDO;

import java.util.List;
import java.util.Map;


public interface MmsLogService {

    List<MmsBatchDO> listBatch(Map<String, Object> map);

    int countBatch(Map<String, Object> map);

    List<MmsSentDO> listSent(Map<String, Object> map);

    int countSent(Map<String, Object> map);

}
