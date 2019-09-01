package com.waheedtechblog.springswagger2.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	// In case of any confusion, Always check for JAVA docs
	public static final Contact DEFAULT_CONTACT = new Contact("Abdul Waheed", "www.waheedtechblog.com",
			"abdulwaheed18@gmail.com");

	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("SWAGGER Tutorial", "Implementation of swagger2", "1.0",
			"urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
			new ArrayList<VendorExtension>());

	private static final ApiInfo apiInfo = null;

	private static final Set<String> DEFAULT_CONTENT_TYPE = new HashSet<String>(Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		// API_INFO to update document information like version, developer contact
		// detail etc
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_CONTENT_TYPE)
				.consumes(DEFAULT_CONTENT_TYPE);
	}

}
