package org.spring.springboot.web;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Administrator
 * @date 2018/04/09
 */
public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        assertEquals("hello world", new HelloWorldController().sayHello());
    }
}
