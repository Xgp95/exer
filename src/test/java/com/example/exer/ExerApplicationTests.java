package com.example.exer;

import com.example.exer.singleton.Singleton1;
import com.example.exer.singleton.Singleton2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@Slf4j
class ExerApplicationTests {

    @Test
    void contextLoads() {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        log.info("i： " + i);
        log.info("j： " + j);
        log.info("k： " + k);
    }

    @Test
    void contextLoads2() {
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;
        log.info(instance1.toString());
        log.info(instance2.toString());
        System.out.println(instance1 == instance2);
    }

    @Test
    void contextLoads3() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        log.info(instance1.toString());
        log.info(instance2.toString());
        System.out.println(instance1 == instance2);
    }
}
