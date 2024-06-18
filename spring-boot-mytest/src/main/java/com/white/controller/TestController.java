package com.white.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lys
 * @since 2024/6/18 15:56
 */
@RestController
public class TestController {

	@GetMapping("/test")
	public String test(){
		return "test";
	}

}
