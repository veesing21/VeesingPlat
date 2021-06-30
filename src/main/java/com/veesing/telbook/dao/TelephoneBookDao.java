package com.veesing.telbook.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.veesing.telbook.domain.TelephoneBookDO;
import com.veesing.telbook.domain.TelephoneBookGroupDO;

@Mapper
public interface TelephoneBookDao {
    List<TelephoneBookGroupDO> listGroups(Map<String, Object> map);

    int countGroups(Map<String, Object> map);

    List<TelephoneBookDO> listPhones(Map<String, Object> map);

    int listPhoneCount(Map<String, Object> map);

    int countPhones(Map<String, Object> map);


}
