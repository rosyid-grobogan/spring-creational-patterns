package com.rosyidgrobogan.springcreationalpatterns.builder;

import lombok.Builder;

@Builder
public class ProductBuilderLombok {

    private String id;

    private String name;

    private String sku;

    private Long price;

}
