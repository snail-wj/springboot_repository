package org.spring.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/04/09
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String sayHello(){
        return "hello world";
    }
}
