package com.api.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.api.project.controller.ProjectController;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.api.project.bean"})
@ComponentScan(basePackageClasses = ProjectController.class)
public class ApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProjectApplication.class, args);
	}

}
