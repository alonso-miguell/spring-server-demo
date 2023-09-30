package com.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}

}
