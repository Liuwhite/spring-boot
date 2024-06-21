package org.example.config;

import org.example.po.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lys
 * @since 2024/6/21 9:26
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {

	static {
		System.out.println("MyAutoConfiguration init........");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}
}
