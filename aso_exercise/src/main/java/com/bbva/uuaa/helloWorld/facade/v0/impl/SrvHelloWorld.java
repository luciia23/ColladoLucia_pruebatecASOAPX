package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDto;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SN000000001", logicalID = "helloWorld")
@VN(vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	@Resource(name = "bSrvHelloWorld")
	private IBSrvHelloWorld business;

	/*
	Método que simula la contratación de tarjetas de crédito para un cliente
	* @param dtoIn objeto de entrada que contiene los datos de la contratación
	* @param nuip El número de identificación del cliente (PathParam)
	* @return Objeto ServiceResponseCreated que contiene el resultado de la contratación
	* */
	@Override
	@POST
	@Path("/simulations/{nuip}")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMC000000033", logicalID = "simulations")
	public ServiceResponseCreated<DtoOut> simulationsPost(DtoIn dtoIn, @PathParam("nuip") String nuip) {
		ISrvMapper mapper = Mappers.getMapper(ISrvMapper.class);
		BDto bDto = mapper.mapIn(dtoIn);
		BDtoOut bDtoOut = business.mapBOut(bDto, nuip);
		DtoOut dtoOut = mapper.mapOut(bDtoOut);
		return ServiceResponseCreated.data(dtoOut).build();
	}
}
