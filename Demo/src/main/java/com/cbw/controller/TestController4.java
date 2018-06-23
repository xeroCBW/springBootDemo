package com.cbw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test4")
public class TestController4 {
	
	
	@RequestMapping("/test01")
	public Object test01() {
		
		
		return "test4---test01";
		
	}

}
