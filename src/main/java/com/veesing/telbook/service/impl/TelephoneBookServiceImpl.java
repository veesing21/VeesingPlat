package com.veesing.telbook.service.impl;

import com.veesing.telbook.dao.TelephoneBookDao;
import com.veesing.telbook.domain.TelephoneBookDO;
import com.veesing.telbook.domain.TelephoneBookGroupDO;
import com.veesing.telbook.service.TelephoneBookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class TelephoneBookServiceImpl implements TelephoneBookService {

    TelephoneBookDao telephoneBookMapper;

    public TelephoneBookServiceImpl(TelephoneBookDao telephoneBookMapper) {
        this.telephoneBookMapper = telephoneBookMapper;
    }

    @Override
    public List<TelephoneBookGroupDO> listGroups(Map<String, Object> map) {
        return telephoneBookMapper.listGroups(map);
    }

    @Override
    public int countGroups(Map<String, Object> map) {
        return telephoneBookMapper.countGroups(map);
    }


    @Override
    public List<TelephoneBookDO> listPhones(Map<String, Object> map) {
        return telephoneBookMapper.listPhones(map);
    }

    @Override
    public int listPhoneCount(Map<String, Object> params) {
        return telephoneBookMapper.listPhoneCount(params);
    }

    @Override
    public int countPhones(Map<String, Object> map) {
        return telephoneBookMapper.countPhones(map);
    }


}
