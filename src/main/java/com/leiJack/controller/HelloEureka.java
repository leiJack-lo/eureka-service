package com.leiJack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEureka {

	@RequestMapping("/helloEureka")
	public String helloEureka() {
		return "hello,my name is eureka";
	}
}
