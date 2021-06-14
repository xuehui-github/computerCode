package com.xue.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xue.dubboapi.service.HelloService;
import com.xue.dubboapi.vo.SayHelloVo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping(value = "sayHello",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String sayHello(
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestHeader("userName")String userName,
            @RequestBody SayHelloVo sayHelloVo){
        System.out.println("Hello dubbo consumer controller^……^");
        return helloService.sayHello(sayHelloVo,acceptLanguage,userName);
    }
}
