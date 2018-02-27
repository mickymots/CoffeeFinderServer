package com.atmlocator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;

import com.atmlocator.controllers.AtmLocatorController;
import com.atmlocator.domain.AtmDetails;

@SpringBootApplication
@ComponentScan("com.atmlocator")
public class AtmLocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmLocatorApplication.class, args);
//		ApplicationContext ctx = SpringApplication.run(AtmLocatorApplication.class,args);
//		AtmLocatorController controller = (AtmLocatorController) ctx.getBean("atmLocatorController");
//		ResponseEntity<AtmDetails[]> list = controller.getAllArticles();

	}

}
