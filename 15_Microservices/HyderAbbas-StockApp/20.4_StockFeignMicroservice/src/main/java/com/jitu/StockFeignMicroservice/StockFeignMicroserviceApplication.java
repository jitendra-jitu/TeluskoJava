package com.jitu.StockFeignMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StockFeignMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockFeignMicroserviceApplication.class, args);
	}

}
