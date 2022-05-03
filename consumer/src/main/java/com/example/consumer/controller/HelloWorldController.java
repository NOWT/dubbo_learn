package com.example.consumer.controller;

import com.example.consumer.service.HelloWarldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo_learn
 * @description:
 * @author: mjw
 * @create: 2022-05-02 13:22
 */
@RestController
public class HelloWorldController {
    @Autowired
    private HelloWarldService helloWorldService;

    @GetMapping("/hello")
    public String getHello() {
        return helloWorldService.getHelloWarld();
    }
}
