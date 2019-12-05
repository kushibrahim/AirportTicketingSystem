package com.kushibrahim.ticketExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class TicketExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketExampleApplication.class, args);
	}

}
