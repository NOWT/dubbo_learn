package com.example.consumer.service;

import com.example.api.GetHelloWarld;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @program: dubbo_learn
 * @description:
 * @author: mjw
 * @create: 2022-05-02 13:24
 */
@Service
public class HelloWarldService {
    @DubboReference(version = "1.0.0", check = false, mock = "throw com.example.consumer.exceptions.MockException")
    private GetHelloWarld helloWarld;

    public String getHelloWarld() {
        return helloWarld.getHelloWarld();
    }
}
