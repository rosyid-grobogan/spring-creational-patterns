package com.rosyidgrobogan.springcreationalpatterns.abstactfactory.creditcard;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.GetBalancePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethodEnum getMethod() {
        return PaymentMethodEnum.CREDIT_CARD;
    }
}
