package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDto;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;

public interface IBSrvHelloWorld {
    BDtoOut mapBOut(BDto bDto, String nuip);
}
