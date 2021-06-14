package com.xue.dubboapi.service;

import com.xue.dubboapi.vo.SayHelloVo;

public interface HelloService {
    String sayHello(SayHelloVo sayHelloVo,String acceptLanguage,String userName);
}
