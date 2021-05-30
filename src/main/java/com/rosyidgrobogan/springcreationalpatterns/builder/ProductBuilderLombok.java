package com.rosyidgrobogan.springcreationalpatterns.builder;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@ToString
public class ProductBuilderLombok {

    private String id;

    private String name;

    private String sku;

    private Long price;

    private CategoryEnum category;
}
