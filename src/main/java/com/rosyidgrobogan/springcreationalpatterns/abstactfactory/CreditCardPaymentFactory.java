package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.creditcard.CreditCardCancelPaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.creditcard.CreditCardChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
//        return new CreditCardGetBalancePaymentRequest();
    }
}
