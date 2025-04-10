package com.example.msclientesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsClientesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientesServiceApplication.class, args);
	}

}
