package com.eureka.client_3.service.hystrix;

import com.eureka.client_3.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p>
 * Created by MDMORY on 2017/11/9.
 * </p>
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello, " + name + ", something is wrong";
    }
}
