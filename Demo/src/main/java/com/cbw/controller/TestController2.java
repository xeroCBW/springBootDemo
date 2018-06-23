package com.cbw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestController2 {
	
	@RequestMapping("/test01")
	public Object test01() {
		
		
		return "test2---test01";
		
	}

}
