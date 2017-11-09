package com.eureka.client_3.service;

import com.eureka.client_3.service.hystrix.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p>
 * Created by MDMORY on 2017/11/8.
 * </p>
 */
@Component
@FeignClient(value = "service-1", fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
