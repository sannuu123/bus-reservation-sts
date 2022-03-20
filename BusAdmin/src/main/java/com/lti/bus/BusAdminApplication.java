package com.lti.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusAdminApplication.class, args);
		System.out.println("Application running");
	}

}
