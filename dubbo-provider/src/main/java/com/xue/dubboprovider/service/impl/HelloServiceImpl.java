package com.xue.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xue.dubboapi.service.HelloService;
import com.xue.dubboapi.vo.SayHelloVo;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(SayHelloVo sayHelloVo,String acceptLanguage,String userName) {
        System.out.println("Hello dubbo provider Service……");
        System.out.println("Hello dubbo :"+userName);
        return "Hello"+sayHelloVo.getName();
    }
}
