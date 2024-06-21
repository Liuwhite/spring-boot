package com.white.springbootmytest;

import org.example.po.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "org.example")
@SpringBootTest
class SpringBootMytestApplicationTests {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	void contextLoads() {
		System.out.println(simpleBean);
	}

}
