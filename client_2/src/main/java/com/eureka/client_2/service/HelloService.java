package com.eureka.client_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p>
 * Created by MDMORY on 2017/11/8.
 * </p>
 */
@Service
public class HelloService {
    private RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String restService(String name) {
        return restTemplate.getForObject("http://SERVICE-1/hello?name=" + name, String.class);
    }
}
