package com.waheedtechblog.springactuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="newendpoint")
@Component
public class NewActuatorEndpoint {
	
	@ReadOperation
	@Bean
	public String message() {
		return "Message from new Endpoint";
	}

}
