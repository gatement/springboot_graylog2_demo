package com.lgh.springboot.graylog2.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AlertsController {

	@PostMapping("/alerts")
	public String hello(@RequestBody String body) {
		log.info("graylog alert: {}", body);
		return "ok";
	}

}
