package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by catt on 2019/10/31.
 * 这个service是为了调用服务提供者，echo这个方法是根据服务提供者提供的方法来写的接口
 */
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class) //@FeignClient("服务名") 注解来指定调用哪个服务
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
