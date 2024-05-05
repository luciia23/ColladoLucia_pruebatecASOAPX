package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;

public interface ISrvHelloWorld {

	ServiceResponseCreated<DtoOut> simulationsPost(DtoIn dtoIn, String nuip);

}
