package com.wj.springboot.test;

import com.wj.springboot.service.PersonProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	private static final Log log = LogFactory.getLog(ApplicationTest.class);

	@Autowired
	private PersonProperties personProperties;

	@Test
	public void test1() {
		Assert.assertEquals("wangjing", personProperties.getName());
		Assert.assertEquals("klmy", personProperties.getAddress());
		Assert.assertEquals("programer", personProperties.getDesc());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + personProperties.getNick());
		log.info("随机int : " + personProperties.getAge());
		log.info("随机long : " + personProperties.getBigValue());
		log.info("随机10以下 : " + personProperties.getTest1());
		log.info("随机10-20 : " + personProperties.getTest2());
	}

}
