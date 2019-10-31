package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by catt on 2019/10/31.
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "请求失败，请检查连接";
    }
}
