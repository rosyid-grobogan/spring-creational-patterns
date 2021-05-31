package com.rosyidgrobogan.springcreationalpatterns.abstactfactory.gopay;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.ChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

public class GopayChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){
        return 1000L;
    }

    @Override
    public PaymentMethodEnum getMethod(){
        return PaymentMethodEnum.GOPAY;
    }
}