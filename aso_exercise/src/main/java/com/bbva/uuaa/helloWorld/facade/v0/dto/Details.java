package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Details {

    @Pattern(regexp = "^[_A-Z\\s\\d\\W]*$")
    private String offerType;
    @Valid
    private Amount limitAmount;
    @Valid
    private Product product;
}
