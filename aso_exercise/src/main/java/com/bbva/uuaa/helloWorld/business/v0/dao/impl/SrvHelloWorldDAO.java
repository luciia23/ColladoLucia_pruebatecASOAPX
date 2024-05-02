package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component(value="srvHelloWorldDAO")
public class SrvHelloWorldDAO implements ISrvHelloWorldDAO {


    @Override
    public BDtoOut mapBOut(BDto bDto, String nuip) {
        BDtoOut bDtoOut = new BDtoOut();
        bDtoOut.setId(numAlea());
        bDtoOut.setNuip(nuip);
        bDtoOut.setDetails(createBDetails(bDto));
        return bDtoOut;
    }

    private BDetailsOut createBDetails(BDto bDto){
        BDetailsOut bDetailsOut = new BDetailsOut();
        BDetails bDetails = bDto.getDetails();
        bDetailsOut.setOfferType(bDetails.getOfferType());
        bDetailsOut.setLimitAmount(bDetails.getLimitAmount());
        bDetailsOut.setMinimumAmount(createMinimumAmount(bDetails.getLimitAmount()));
        bDetailsOut.setMaximumAmount(createMaximumAmount(bDetails.getLimitAmount()));
        bDetailsOut.setProduct(bDetails.getProduct());
        return bDetailsOut;
    }

    private BAmount createMinimumAmount(BAmount limitAmount){
        BAmount minimumAmount = new BAmount();
        minimumAmount.setAmount(calculateLimit(limitAmount.getAmount(), true));
        minimumAmount.setCurrency(limitAmount.getCurrency());
        return minimumAmount;
    }

    private BAmount createMaximumAmount(BAmount limitAmount){
        BAmount maximumAmount = new BAmount();
        maximumAmount.setAmount(calculateLimit(limitAmount.getAmount(), false));
        maximumAmount.setCurrency(limitAmount.getCurrency());
        return maximumAmount;
    }

    private int calculateLimit(int limitAmount, boolean isMinimum){
        double percentage = isMinimum ? 0.1 : 0.05;
        return isMinimum ? limitAmount - (int) (limitAmount * percentage) : limitAmount + (int) (limitAmount * percentage);
    }

    private BProduct createBProduct(BDto bDto){
        BProduct bProduct = new BProduct();
        bProduct.setId(bDto.getDetails().getProduct().getId());
        bProduct.setSubproduct(bDto.getDetails().getProduct().getSubproduct());
        return bProduct;
    }

    private String numAlea(){
        String uuid = UUID.randomUUID().toString().toUpperCase().replace("-", "");
        return uuid.substring(0, 10);
    }

}
