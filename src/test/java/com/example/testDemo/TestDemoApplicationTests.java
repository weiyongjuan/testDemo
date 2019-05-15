package com.example.testDemo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestDemoApplicationTests.class)
@SpringBootApplication

public class TestDemoApplicationTests {


    @Test
    public void contextLoads() {
        System.out.println("测试类出来了");
    }
}
