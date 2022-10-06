package com.example.exer;

import com.example.exer.singleton.Singleton1;
import com.example.exer.singleton.Singleton2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

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

    @Test
    void contextLoads4() {
        for (int i = 1; i < 50; i++) {
            System.out.println(fibonacci(i) + " ==> " + i);
        }
    }

    public Integer fibonacci(Integer n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
