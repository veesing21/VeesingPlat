package com.veesing.system.service;

import com.veesing.system.domain.CopyrightDO;

public interface CopyrightService {

    CopyrightDO getByCustomerId(Long customerId);

}
