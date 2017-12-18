package com.sleuth.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy.zhang yangyang.zhang@anxincloud.com
 * @Description
 * @date 2017/12/15 12:36
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @GetMapping("hi")
    public String hi() {
        return "hi,how are you!";
    }
}
