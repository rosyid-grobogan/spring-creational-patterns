package com.rosyidgrobogan.springcreationalpatterns.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApp {

    @Bean
    public Counter counter(){
        return new Counter();
    }

    @Bean
    public CounterSolution counterSolution(){
        return new CounterSolution();
    }
}
