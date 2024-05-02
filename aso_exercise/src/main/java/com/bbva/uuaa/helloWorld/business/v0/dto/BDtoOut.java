package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BDtoOut {
    private String id;
    private String nuip;
    private BDetailsOut details;
}
