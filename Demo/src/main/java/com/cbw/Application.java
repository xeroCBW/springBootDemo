package com.cbw;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//@SpringBootApplication 相当于 @Configuration、@EnableAutoConfiguration 、 @ComponentScan 三个的作用
//spring boot里，扫描的class对象是用注解@ComponentScan(未指定的情况下默认是main函数所在package)来指定的 
//@ComponentScan(basePackages = "com.cbw") //这个是默认配置,如果改成com.cbw.controller就不能使用切片了
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
