package com.naturalprogrammer.udemynpspring5tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.naturalprogrammer")
public class UdemyNpSpring5TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyNpSpring5TutorialApplication.class, args);
	}

}
