package com.lgh.springboot.graylog2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	private static final Logger log = LogManager.getLogger();

	@GetMapping("/log")
	public String hello(@RequestParam(name = "level", defaultValue = "info") String logLevel,
			@RequestParam(name = "log", defaultValue = "hello") String logStr) {
		boolean success = false;
		if ("info".equals(logLevel)) {
			log.info(logStr);
			success = true;
		}
		else if ("error".equals(logLevel)) {
			log.error(logStr);
			success = true;
		}
		
		if (success) {
			return "log[" + logLevel + "]: " + logStr;
		}
		else {
			return "only level=info|error is supported";
		}
	}

}
