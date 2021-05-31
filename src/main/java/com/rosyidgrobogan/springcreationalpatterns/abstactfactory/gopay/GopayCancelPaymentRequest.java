package com.rosyidgrobogan.springcreationalpatterns.abstactfactory.gopay;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.CancelPaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;


    @Override
    public PaymentMethodEnum getMethod() {
        return PaymentMethodEnum.GOPAY;
    }
}
