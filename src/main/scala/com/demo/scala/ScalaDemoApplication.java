package com.demo.scala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ScalaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalaDemoApplication.class, args);
	}

}
