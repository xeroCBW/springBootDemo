package com.cbw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test3")
public class TestController3 {
	
	@RequestMapping("/test01")
	public Object test01() {
		
		
		return "test3---test01";
		
	}

}
