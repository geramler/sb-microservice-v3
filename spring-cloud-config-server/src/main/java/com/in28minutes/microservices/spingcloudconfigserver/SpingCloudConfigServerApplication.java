package com.in28minutes.microservices.spingcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpingCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudConfigServerApplication.class, args);
	}

}
