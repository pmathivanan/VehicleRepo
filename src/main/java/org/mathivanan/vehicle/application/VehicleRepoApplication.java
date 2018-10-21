package org.mathivanan.vehicle.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.mathivanan.vehicle.service,org.mathivanan.vehicle.application")
public class VehicleRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRepoApplication.class, args);
	}
	
/*	 @Bean
	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	        return args -> {

	            System.out.println("Let's inspect the beans provided by Spring Boot:");

	            String[] beanNames = ctx.getBeanDefinitionNames();
	            Arrays.sort(beanNames);
	            for (String beanName : beanNames) {
	                System.out.println(beanName);
	            }

	        };
	    }*/

}
