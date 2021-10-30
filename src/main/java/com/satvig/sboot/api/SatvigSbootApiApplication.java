package com.satvig.sboot.api;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SatvigSbootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatvigSbootApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
		return args -> {
			System.out.println("Let's inspect all the beans provided by Spring boot");
			String beanDefinitionNames[] = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beanDefinitionNames);
			for(String beanDefinitionName : beanDefinitionNames) {
				System.out.println(beanDefinitionName);
			}
		};
	}

}
