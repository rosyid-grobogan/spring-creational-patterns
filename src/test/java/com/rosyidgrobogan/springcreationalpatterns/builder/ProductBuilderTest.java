package com.rosyidgrobogan.springcreationalpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {

    @Test
    void testBuilder(){
        Product product1 = new ProductBuilder()
                .setId("001")
                .setName("iPhone")
                .setSku("AP1")
                .setPrice(15_000_000L)
                .build();

        // bisa setValuenya tidak berurutan
        Product product2 = new ProductBuilder()
                .setId("002")
                .setSku("S1")
                .setPrice(13_000_000L)
                .setName("Samsung X")
                .build();

        // bisa isi sebagian
        Product product3 = new ProductBuilder()
                .setId("003")
                .setName("Samsung X")
                .build();

        System.out.println(product1); // Product(id=001, name=iPhone, sku=AP1, price=15000000)
        System.out.println(product2); // Product(id=002, name=Samsung X, sku=S1, price=13000000)
        System.out.println(product3); // Product(id=003, name=Samsung X, sku=null, price=null)
    }

}