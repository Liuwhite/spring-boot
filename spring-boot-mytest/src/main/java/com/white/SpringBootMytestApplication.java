package com.white;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.white")
@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
