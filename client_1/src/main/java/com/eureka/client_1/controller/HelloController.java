package com.eureka.client_1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p>
 * Created by MDMORY on 2017/11/8.
 * </p>
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello, " + name + ", i am from " + port;
    }
}
