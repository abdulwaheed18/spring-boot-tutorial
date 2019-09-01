package com.waheedtechblog.springactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

}

/**
 * To check Actuator Endpoint http://localhost:8080/actuator
 * 
 * For easy Navigaton, Hit localhost:8080,it will open HAL broswer
 * 
 */
