package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDto;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISrvMapper {
    BDto mapIn(DtoIn dtoIn);
    DtoOut mapOut(BDtoOut bDtoOut);
}
