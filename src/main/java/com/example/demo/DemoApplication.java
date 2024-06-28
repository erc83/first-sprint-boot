package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		logger.debug("Mi mensaje debug");				// este quedan oculto el mensage debug
		logger.info("Mi mensaje info");
		logger.warn("Mi mensaje warning");
		logger.error("Mi mensaje error");
		//logger.trace("Mi mensaje trace");

	}

}
