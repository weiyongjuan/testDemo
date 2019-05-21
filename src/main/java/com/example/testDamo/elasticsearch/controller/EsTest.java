package com.example.testDamo.elasticsearch.controller;

import com.example.testDamo.elasticsearch.bean.EsBean;
import com.example.testDamo.elasticsearch.services.EsService;
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
    @Autowired
    private EsService esService;


    @RequestMapping("hello")
    public String index(@RequestParam String id) {
        log.info("开始学习elasticsearch");
        log.info("调用service");
        esService.printlnInfo();
        return "Hello World";
    }

}
