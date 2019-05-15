package com.example.testDamo.elasticsearch.controller;

import com.example.testDamo.elasticsearch.bean.EsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EsTest {
    private  static final Logger  log = LoggerFactory.getLogger(EsTest.class);
    @Autowired
    private EsBean esBean;


    @RequestMapping("hello")
    public String index(@RequestParam String id) {
        log.info("开始学习elasticsearch");
        return "Hello World";
    }

}
