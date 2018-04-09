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
 * @date 2018/04/09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityPropertiesTest {

    private static Logger LOGGER = LoggerFactory.getLogger(CityPropertiesTest.class);

    @Autowired
    private CityProperties cityProperties;

    @Test
    public void testCityProperties(){
        LOGGER.info("\n\n" + cityProperties.toString() +"\n");
    }
}
