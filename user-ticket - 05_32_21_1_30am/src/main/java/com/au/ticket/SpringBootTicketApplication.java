package com.au.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.au.ticket.repository")
@SpringBootApplication
public class SpringBootTicketApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTicketApplication.class, args);
	}

}
