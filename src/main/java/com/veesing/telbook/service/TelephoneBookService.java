package com.veesing.telbook.service;

import java.util.List;
import java.util.Map;

import com.veesing.telbook.domain.TelephoneBookDO;
import com.veesing.telbook.domain.TelephoneBookGroupDO;

public interface TelephoneBookService {

    List<TelephoneBookGroupDO> listGroups(Map<String, Object> params);

    int countGroups(Map<String, Object> params);

    List<TelephoneBookDO> listPhones(Map<String, Object> params);

    int listPhoneCount(Map<String, Object> params);

    int countPhones(Map<String, Object> params);


}
