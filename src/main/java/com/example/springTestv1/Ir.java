package com.example.springTestv1;

import java.security.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Ir 
{
	@RequestMapping("/sam")
	public String printz() {
		
		return "I'm Welcome Message from Noki "+System.currentTimeMillis();
		
	}

}
