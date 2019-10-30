package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by catt on 2019/10/30.
 */
@RestController
public class NacosProviderConctroller {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message){
        return "Hello nacos " + message;
    }

}
