package org.deegaem.bfserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BfServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfServiceRegistryApplication.class, args);
	}

}
