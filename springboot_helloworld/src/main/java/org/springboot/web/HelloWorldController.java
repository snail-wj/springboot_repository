package org.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Date 2018/04/05
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String sayHelloWorld(){
        return "hello World !";
    }
}
