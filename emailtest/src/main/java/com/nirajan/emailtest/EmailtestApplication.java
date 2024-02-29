package com.nirajan.emailtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EmailtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailtestApplication.class, args);
	}

}
