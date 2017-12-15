package com.example.demo.logistic.service;

public class FinanceServiceHystrix implements FinanceService{
    @Override
    public String sayHiFinance() {
        return "Sorry,financeService is down!";
    }
}
