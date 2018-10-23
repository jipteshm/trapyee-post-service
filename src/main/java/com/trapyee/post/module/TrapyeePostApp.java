package com.trapyee.post.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrapyeePostApp {
	
	public static void main(String[] args) {
		SpringApplication.run(TrapyeePostApp.class, args);
	}

}
