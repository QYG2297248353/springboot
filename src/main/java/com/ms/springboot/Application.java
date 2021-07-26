package com.ms.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// 注解 @SpringBootApplication 表示这是一个SpringBoot应用
		SpringApplication.run(Application.class, args);

	}

}
