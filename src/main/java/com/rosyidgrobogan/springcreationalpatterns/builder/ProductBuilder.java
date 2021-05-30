package com.rosyidgrobogan.springcreationalpatterns.builder;

/**
 * Membuat builder manual
 */
public class ProductBuilder {

    private String id;

    private String name;

    private String sku;

    private Long price;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Product build(){
        return new Product(id, name, sku, price);
    }
}
