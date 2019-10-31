package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by catt on 2019/10/31.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  //enablefeignclients 用来开启feign功能
public class NacosConsumerFeignApplication {
    public static void main(String[] args){
        SpringApplication.run(NacosConsumerFeignApplication.class,args);
    }
}
