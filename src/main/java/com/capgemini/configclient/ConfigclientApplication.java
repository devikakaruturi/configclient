package com.capgemini.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
	@RefreshScope
	@RestController
	public class MessageResource {

		
		
		@Value("${message:Default Hello}")
		private String message;
		@RequestMapping("/message")
		public String getMessage()
		{
			return this.message;
		}
	}
}
