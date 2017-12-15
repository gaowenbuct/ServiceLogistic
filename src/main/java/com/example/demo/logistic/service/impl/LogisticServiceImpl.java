package com.example.demo.logistic.service.impl;

import com.example.demo.logistic.service.LogisticService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "logisticService")
public class LogisticServiceImpl implements LogisticService {
    private static final Logger log = LoggerFactory.getLogger(LogisticServiceImpl.class);
    @Value("${server.port}")
    String port;
    @Override
    public String sayHi() {
        log.info("sayHi called");
        return "Hi,i am logisticService from port:" +port;
    }
}
