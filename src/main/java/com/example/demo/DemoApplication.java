package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("commit c1");
		System.out.println("commit c1v2");
		System.out.println("commit c2");
		System.out.println("commit c3");
		System.out.println("commit c4");
		System.out.println("commit c5");
		System.out.println("commit c6 conflict");
		System.out.println("commit c7");
		SpringApplication.run(DemoApplication.class, args);
	}

}
