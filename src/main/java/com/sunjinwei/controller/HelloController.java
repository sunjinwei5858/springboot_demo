package com.sunjinwei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.sunjinwei.controller
 * @author: sun jinwei
 * @create: 2022-09-18 17:56
 * @description:
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }


}