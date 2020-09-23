package com.mydemo.spmydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpmydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmydemoApplication.class, args);
	}

	@GetMapping(value="/check")
	public String getData(){
		return "Hello Spring Program";
	}
}
