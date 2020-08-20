package com.capg.mra.customermanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
public class MraCustomerManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MraCustomerManagementSystemApplication.class, args);
	}
	
	/**
	 * @Bean annotation tells that a method produces a bean to be managed by the Spring container
	 * @return RestTemplate
	 */
	@Bean 
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
