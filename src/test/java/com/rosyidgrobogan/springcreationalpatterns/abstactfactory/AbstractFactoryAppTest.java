package com.rosyidgrobogan.springcreationalpatterns.abstactfactory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AbstractFactoryAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    // test
    @Test
    void testAbstractFactory(){
        PaymentFactory creditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory bank = applicationContext.getBean(BankPaymentFactory.class);
        PaymentFactory gopay = applicationContext.getBean(GopayPaymentFactory.class);

        charge(creditCard);
        charge(bank);
        charge(gopay);
    }


    // method (KODE CLIENT)
    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("001");
        request.setAmount(500L);

        // kirim ke payment gateway
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("002");

        // kirim ke payment gateway
        System.out.println(request);
    }

    public Long getBalance(PaymentFactory paymentFactory){
        try {
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("rosyid");
            // send to payment gateway
            System.out.println(request);
            return 1000L;
        } catch (UnsupportedOperationException exception){
            return 0L;
        }
    }
}