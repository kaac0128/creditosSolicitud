package com.creditos.creditosSolicitud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.creditos.models"}) 
@ComponentScan(basePackages={"com.creditos.controllers", "com.creditos.services", "com.creditos.repository"})
@EnableJpaRepositories("com.creditos.repository")
public class CreditosSolicitudApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CreditosSolicitudApplication.class, args);
	}



}
