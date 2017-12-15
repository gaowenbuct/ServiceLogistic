package com.example.demo.logistic.controller;

import com.example.demo.logistic.service.LogisticService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LogisticController {
    @Resource
    LogisticService logisticService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return logisticService.sayHi();
    }
}
