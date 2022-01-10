package com.capgemini.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.capgemini.project","com.capgemini.project.controller","com.capgemini.project.dao","com.capgemini.project.model"})
@EntityScan({"com.capgemini.project","com.capgemini.project.controller","com.capgemini.project.dao","com.capgemini.project.model"})
@EnableJpaRepositories({"com.capgemini.project","com.capgemini.project.controller","com.capgemini.project.model"})

public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

}
