package com.example.testDemo.com.example.testDamo.es;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsTest {
    @RequestMapping("hello")
    public String index() {
        return "Hello World";
    }
}