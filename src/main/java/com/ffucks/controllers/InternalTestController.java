package com.ffucks.controllers;


import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile({"dev", "test"})
//@ConditionalOnProperty(name = "features.test-endpoints", havingValue = "true")
@RequestMapping("/internal")
public class InternalTestController {

    @GetMapping("/ping")
    public String ping() { return "pong"; }
}
