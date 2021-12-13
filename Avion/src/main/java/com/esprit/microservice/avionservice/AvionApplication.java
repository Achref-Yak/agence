package com.esprit.microservice.avionservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class AvionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvionApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(AvionRepository repository) {
	        return args -> {
	            Stream.of("Airbus A320", "Boeing 747", "Boeing 777").forEach(type -> {
	                repository.save(new Avion(type,230,"Airbus"));
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
