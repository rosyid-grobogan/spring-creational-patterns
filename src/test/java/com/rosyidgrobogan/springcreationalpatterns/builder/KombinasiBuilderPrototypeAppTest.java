package com.rosyidgrobogan.springcreationalpatterns.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = KombinasiBuilderPrototypeApp.class)
class KombinasiBuilderPrototypeAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testKombinasiBuilderPrototype() {
        ProductBuilderLombok product = applicationContext.getBean("productGadget", ProductBuilderLombok.class);
        product.setName("Samsung XL");

        System.out.println(product); // ProductBuilderLombok(id=null, name=Samsung XL, sku=null, price=null, category=GADGET)
    }

}