package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.bank.BankCancelPaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.bank.BankChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.bank.BankGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BankChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BankCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BankGetBalancePaymentRequest();
    }
}
