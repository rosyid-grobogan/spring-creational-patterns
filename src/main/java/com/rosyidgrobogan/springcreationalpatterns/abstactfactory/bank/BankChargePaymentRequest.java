package com.rosyidgrobogan.springcreationalpatterns.abstactfactory.bank;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.ChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

public class BankChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){
        return 6500L;
    }

    @Override
    public PaymentMethodEnum getMethod(){
        return PaymentMethodEnum.BANK;
    }
}