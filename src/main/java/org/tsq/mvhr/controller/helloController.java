package org.tsq.mvhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    //测试
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/employee/basic")
    public String basic() {
        return "/employee/basic/**";
    }

    @GetMapping("/employee/advanced")
    public String advanced() {
        return "/employee/advanced/**";
    }
}


