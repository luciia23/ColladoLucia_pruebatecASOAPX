package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailsOut {
    private String offerType;
    private Amount limitAmount;
    private Amount minimumAmount;
    private Amount maximumAmount;
    private Product product;
}
