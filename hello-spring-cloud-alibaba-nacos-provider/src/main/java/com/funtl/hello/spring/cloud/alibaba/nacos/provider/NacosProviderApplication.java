package com.funtl.hello.spring.cloud.alibaba.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by catt on 2019/10/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
//配置中心自动刷新
@RefreshScope
public class NacosProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
