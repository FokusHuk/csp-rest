package com.petshopspringboot.petshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.petshopspringboot.petshopspring.repository")
@SpringBootApplication
public class PetshopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetshopSpringApplication.class, args);
	}

}
