package com.abc.service.impl;

import com.abc.service.SomeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TwoServiceImpl implements SomeService {
    @Override
    public String send() {
        return "test-调用短信运营商接口发送信息";
    }

    @Override
    public void doSome() {

    }
}
