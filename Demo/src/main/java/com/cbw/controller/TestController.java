package com.cbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home() {
		

//		return "home";
		return "redirect:/index.html";
		
	}

	@RequestMapping("/test")
	public String test() {

		return "test";
	}

	@RequestMapping("/first")
	public Object first() {
		return "first controller";
	}

	@RequestMapping("/doError")
	public Object error() {
		return 1 / 0;
	}

	@RequestMapping("/second")
	public Object second() {
		return "second controller";
	}

}
