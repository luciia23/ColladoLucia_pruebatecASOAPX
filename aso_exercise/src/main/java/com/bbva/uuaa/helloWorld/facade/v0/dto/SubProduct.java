package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class SubProduct {
    @Pattern(regexp = "^\\w{2}$")
    private String id;
}
