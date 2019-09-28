package com.example.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.demo.dao")
public class JavaSpringTestApplication {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println("hello world hhaha");
		SpringApplication.run(JavaSpringTestApplication.class, args);

	}


}
