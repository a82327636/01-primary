package com.abc.service.impl;

import com.abc.service.SomeService;
import org.springframework.stereotype.Service;


public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行SomeServiceImpl的doSome()方法");
    }

    @Override
    public String send() {
        return null;
    }
}
