package com.se330.uitbooknetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UitBookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(UitBookNetworkApplication.class, args);
	}

}
