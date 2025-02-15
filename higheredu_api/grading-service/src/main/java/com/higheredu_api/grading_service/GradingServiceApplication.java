package com.higheredu_api.grading_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GradingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradingServiceApplication.class, args);
	}

}
