package com.example.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServerTestApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		
		SpringApplication.run(ServerTestApplication.class, args);
		
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(ServerTestApplication.class);
	 }

}
