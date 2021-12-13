package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


import filtre.ErrorFilter;
import filtre.PostFiltre ;
import filtre.PreFiltre;
import filtre.RouteFiltre;


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.Clientui")

public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
	@Bean
	public PreFiltre preFiltre () {
		return new PreFiltre();
		
	}
	@Bean
	public PostFiltre PostFiltre () {
		return new PostFiltre();
		
	}
	@Bean
	public ErrorFilter ErrorFiltre () {
		return new ErrorFilter();
		
	}
	@Bean
	public RouteFiltre RouteFiltre () {
		return new RouteFiltre();
		
	}
			
}
