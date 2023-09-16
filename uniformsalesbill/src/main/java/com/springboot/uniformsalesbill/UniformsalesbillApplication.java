package com.springboot.uniformsalesbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SalesManagementSystemApplication.class, args);
	}

	@Autowired
	private SalesRepository salesRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
