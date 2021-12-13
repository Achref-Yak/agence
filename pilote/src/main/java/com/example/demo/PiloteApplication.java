package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class PiloteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiloteApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(PiloteRepository piloteRepository) {
	        return args -> {
	            Stream.of("Mariem", "Sarra", "Mohamed").forEach(nom -> {
	            	piloteRepository.save(new Pilote(nom));
	            });
	            piloteRepository.findAll().forEach(System.out::println);
	        };
	    }

}
