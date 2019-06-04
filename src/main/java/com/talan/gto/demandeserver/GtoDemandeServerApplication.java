package com.talan.gto.demandeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GtoDemandeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtoDemandeServerApplication.class, args);
	}

}
