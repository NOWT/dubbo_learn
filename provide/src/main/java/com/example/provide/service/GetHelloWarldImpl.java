package com.example.provide.service;

import com.example.api.GetHelloWarld;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @program: dubbo_learn
 * @description:
 * @author: mjw
 * @create: 2022-05-02 09:58
 */
@DubboService(version = "1.0.0")
public class GetHelloWarldImpl implements GetHelloWarld {
    @Override
    public String getHelloWarld() {
        return "hello cat";
    }
}
