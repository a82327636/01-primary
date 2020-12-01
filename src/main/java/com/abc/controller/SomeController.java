package com.abc.controller;

import com.abc.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @Autowired
    private SomeService service;

    @GetMapping("/some")
    public String someHandle() {
        // int i = 3 / 0; 放开注释会报错
        return "hello spring boot 世界";
    }


    @RequestMapping("/send")
    public String sendHandle() {
        return service.send();
    }


}
