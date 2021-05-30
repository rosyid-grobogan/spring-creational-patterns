package com.rosyidgrobogan.springcreationalpatterns.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class KombinasiBuilderPrototypeApp {

    @Bean
    @Scope("prototype")
    public ProductBuilderLombok productGadget(){
        return ProductBuilderLombok.builder()
                .category(CategoryEnum.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public ProductBuilderLombok productFashion(){
        return ProductBuilderLombok.builder()
                .category(CategoryEnum.FASHION)
                .build();
    }
}
