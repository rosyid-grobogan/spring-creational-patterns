package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String userId);

    PaymentMethodEnum getMethod();

}
