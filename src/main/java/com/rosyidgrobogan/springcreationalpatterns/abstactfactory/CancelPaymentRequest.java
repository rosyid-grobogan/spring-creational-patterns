package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethodEnum getMethod();

}
