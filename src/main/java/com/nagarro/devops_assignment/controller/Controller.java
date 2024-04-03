package com.nagarro.devops_assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping("/welcome")
	public String getMessage() {
		return "This is DevOps Assignment!!";
	}

	@GetMapping("/Week2")
	public String getMessage2() {
		return "In week:2a We have to create a Jenkins freestyle project for downloading code from the GitHub.";
	}
	
	@GetMapping("/Week3")
	public String getMessage3() {
		return "In week:3a We have to create a freestyle Jenkins pipeline to build and deploy the Spring Boot Application using Docker.";
	}
	@GetMapping("/")
    public String getAllMessages() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMessage()).append("\n");
        sb.append(getMessage2()).append("\n");
        sb.append(getMessage3());
        return sb.toString();
    }

}
