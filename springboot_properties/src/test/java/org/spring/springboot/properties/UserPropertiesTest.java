package org.spring.springboot.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Administrator
 * @date 2018/04/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPropertiesTest {

    private static Logger LOGGER = LoggerFactory.getLogger(UserPropertiesTest.class);

    @Autowired
    private UserProperties userProperties;

    @Test
    public void testUserProperties(){
        LOGGER.info("\n\n" + userProperties.toString() + "\n");
    }
}
