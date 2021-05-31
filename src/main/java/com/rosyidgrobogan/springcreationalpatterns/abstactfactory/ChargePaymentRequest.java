package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

public interface ChargePaymentRequest {

    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    PaymentMethodEnum getMethod();

}
