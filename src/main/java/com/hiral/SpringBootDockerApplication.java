package com.hiral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootDockerApplication.main()");
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}