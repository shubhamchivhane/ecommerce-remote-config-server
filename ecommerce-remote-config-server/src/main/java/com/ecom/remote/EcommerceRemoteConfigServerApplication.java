package com.ecom.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EcommerceRemoteConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceRemoteConfigServerApplication.class, args);
	}

}
