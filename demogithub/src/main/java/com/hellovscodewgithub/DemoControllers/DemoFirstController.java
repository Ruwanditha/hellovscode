package com.hellovscodewgithub.DemoControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoFirstController {
    @GetMapping(value = "/hello")
    public String getMethodName() {
        return "Hello GitHub with Spring Boot";
    }
}
