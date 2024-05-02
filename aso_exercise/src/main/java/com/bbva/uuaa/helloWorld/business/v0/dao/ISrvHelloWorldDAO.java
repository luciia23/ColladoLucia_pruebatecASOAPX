package com.bbva.uuaa.helloWorld.business.v0.dao;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDto;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;

public interface ISrvHelloWorldDAO {
    BDtoOut mapBOut(BDto bDto, String nuip);
}
