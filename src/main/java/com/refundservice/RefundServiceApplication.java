package com.refundservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RefundServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefundServiceApplication.class, args);
	}

}
