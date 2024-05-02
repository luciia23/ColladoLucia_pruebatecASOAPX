package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDto;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "bSrvHelloWorld")
public class BSrvHelloWorld implements IBSrvHelloWorld {

    @Resource(name = "srvHelloWorldDAO")
    private ISrvHelloWorldDAO dao;

    @Override
    public BDtoOut mapBOut(BDto bDto, String nuip) {
        return dao.mapBOut(bDto, nuip);
    }
}
