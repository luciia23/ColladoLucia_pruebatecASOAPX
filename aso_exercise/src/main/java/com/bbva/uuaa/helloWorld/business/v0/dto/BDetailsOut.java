package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BDetailsOut {
    private String offerType;
    private BAmount limitAmount;
    private BAmount minimumAmount;
    private BAmount maximumAmount;
    private BProduct product;
}
