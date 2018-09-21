package com.ch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HelloApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HelloApplication.class, args);
		SpringApplication application = new SpringApplication(HelloApplication.class);
		//application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
