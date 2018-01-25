package com.cch.demo04.service;

import org.springframework.stereotype.Component;

/**
 * Created by 459105408@qq.com
 * 2018-01-24 19:17.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
