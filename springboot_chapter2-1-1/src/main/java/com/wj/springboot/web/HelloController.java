package com.wj.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WJ
 * @date 2018/05/23
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello, world";
    }
}
