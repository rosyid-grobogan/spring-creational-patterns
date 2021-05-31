package com.rosyidgrobogan.springcreationalpatterns.abstactfactory.creditcard;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.ChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethodEnum getMethod(){
        return PaymentMethodEnum.CREDIT_CARD;
    }
}