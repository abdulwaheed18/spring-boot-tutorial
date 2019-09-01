package com.waheedtechblog.springehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching 
public class SpringEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEhcacheApplication.class, args);
	}

}
