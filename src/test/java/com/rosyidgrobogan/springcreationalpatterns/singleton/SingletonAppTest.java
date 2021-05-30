package com.rosyidgrobogan.springcreationalpatterns.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingletonApp.class)
class SingletonAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSingleton() {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue()); // 3
        System.out.println(counter2.getValue()); // 3
        System.out.println(counter3.getValue()); // 3
    }
}