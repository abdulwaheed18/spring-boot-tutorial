package com.waheedtechblog.springswagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwagger2Application.class, args);
	}

}
