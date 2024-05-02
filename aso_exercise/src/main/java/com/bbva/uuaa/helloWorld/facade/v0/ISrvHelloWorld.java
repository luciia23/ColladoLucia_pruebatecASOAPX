package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoBody;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseNoContent;
import com.bbva.uuaa.helloWorld.facade.v0.dto.*;

public interface ISrvHelloWorld {

	ServiceResponseCreated<DtoOut> simulationsPost(DtoIn dtoIn, String nuip);

}
