package com.rancho_smart.ms_mercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsMercadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMercadoApplication.class, args);
	}

}
