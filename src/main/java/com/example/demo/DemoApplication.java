package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("commit c1");
		System.out.println("commit c2");
		System.out.println("commit c3");
		System.out.println("commit c4 conflict");
		SpringApplication.run(DemoApplication.class, args);
	}

}
