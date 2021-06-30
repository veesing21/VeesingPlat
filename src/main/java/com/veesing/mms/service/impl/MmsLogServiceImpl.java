package com.veesing.mms.service.impl;

import com.veesing.mms.dao.MmsBatchDao;
import com.veesing.mms.dao.MmsSentDao;
import com.veesing.mms.domain.MmsBatchDO;
import com.veesing.mms.domain.MmsSentDO;
import com.veesing.mms.service.MmsLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MmsLogServiceImpl implements MmsLogService {

    MmsSentDao mmsSentMapper;

    MmsBatchDao mmsBatchMapper;

    public MmsLogServiceImpl(MmsSentDao mmsSentMapper, MmsBatchDao mmsBatchMapper) {
        this.mmsSentMapper = mmsSentMapper;
        this.mmsBatchMapper = mmsBatchMapper;
    }

    @Override
    public List<MmsBatchDO> listBatch(Map<String, Object> map) {
        return mmsBatchMapper.list(map);
    }

    @Override
    public int countBatch(Map<String, Object> map) {
        return mmsBatchMapper.count(map);
    }

    @Override
    public List<MmsSentDO> listSent(Map<String, Object> map) {
        return mmsSentMapper.list(map);
    }

    @Override
    public int countSent(Map<String, Object> map) {
        return mmsSentMapper.count(map);
    }



}
