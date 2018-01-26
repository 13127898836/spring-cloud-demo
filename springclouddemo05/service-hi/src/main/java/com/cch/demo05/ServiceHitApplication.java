package com.cch.demo05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHitApplication.class, args);
	}
}
