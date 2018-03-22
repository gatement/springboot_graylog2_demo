package com.lgh.springboot.graylog2.demo;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final Logger log = LogManager.getLogger();

	@GetMapping("/hello")
	public String hello() throws Exception {
		long ts = System.currentTimeMillis();
		ThreadContext.put("msgid", UUID.randomUUID().toString());
		Thread.sleep(200); // for demo purpose
		ThreadContext.put("timeUsed", Long.toString(System.currentTimeMillis() - ts));
		log.info("done");
		return "hello world";
	}

}
