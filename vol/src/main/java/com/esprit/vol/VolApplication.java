package com.esprit.vol;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class VolApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolApplication.class, args);
	}
	 @Bean
	    ApplicationRunner init(volRepository repository) {
	        return args -> {
	            Stream.of().forEach(type -> {
	                repository.save(new vol());
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
