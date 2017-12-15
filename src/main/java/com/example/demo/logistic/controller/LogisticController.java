package com.example.demo.logistic.controller;

import com.example.demo.logistic.service.FinanceService;
import com.example.demo.logistic.service.LogisticService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LogisticController {
    @Resource
    LogisticService logisticService;
    @Resource
    FinanceService financeService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return logisticService.sayHi()+"\n"+financeService.sayHiFinance();
    }
    @RequestMapping(value = "/hi-order",method = RequestMethod.GET)
    public String sayHiFinance(){
        return financeService.sayHiFinance();
    }
}
