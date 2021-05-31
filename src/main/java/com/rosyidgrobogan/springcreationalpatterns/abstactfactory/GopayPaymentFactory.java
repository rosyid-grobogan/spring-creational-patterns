package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.gopay.GopayCancelPaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.gopay.GopayChargePaymentRequest;
import com.rosyidgrobogan.springcreationalpatterns.abstactfactory.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
