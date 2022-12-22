package com.client.clientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ClientServiceApplication {

	@Value(value = "${my.value}")
	private String myValue;

	@GetMapping("/")
	public String getMyValue() {
		return "My value: " + myValue;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

}
