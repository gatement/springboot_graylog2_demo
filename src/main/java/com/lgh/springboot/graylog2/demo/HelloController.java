package com.lgh.springboot.graylog2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		log.info("GET /hello");
		return "hello world, graylog2";
	}

}
