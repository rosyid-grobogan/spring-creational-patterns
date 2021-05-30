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

    // Problem: Race Condition
    private void incrementCounterAsync(Counter counter, int total) {
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }

    // test: race condition
    @Test
    void incrementRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 1000_000);
        incrementCounterAsync(counter2, 1000_000);

        Thread.sleep(5_000L);

        System.out.println(counter1.getValue()); // 1094228 (bisa berubah-ubah
        System.out.println(counter2.getValue()); // 1094228
    }
}