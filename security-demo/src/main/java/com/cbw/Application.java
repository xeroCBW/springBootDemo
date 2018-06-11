package com.cbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//开启swagger2自动生成接口
public class Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}
