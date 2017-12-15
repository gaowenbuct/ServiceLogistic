package com.example.demo.logistic.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-finance",fallback = FinanceServiceHystrix.class)
public interface FinanceService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFinance();
}
