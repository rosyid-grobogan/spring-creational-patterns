package com.rosyidgrobogan.springcreationalpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderLombokTest {

    @Test
    void testBuilder(){
        ProductBuilderLombok iphone = ProductBuilderLombok.builder()
                .id("XX")
                .name("Iphone")
                .sku("001")
                .price(15_000_000l)
                .build();

        System.out.println(iphone);
    }

}