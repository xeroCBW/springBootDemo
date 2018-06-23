package com.cbw.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbw.exception.MyException;
import com.cbw.exception.OtherException;

@RestController
@RequestMapping("exception")
public class Exception {
	
	
	@PostMapping("test")
	public Object test()  throws  MyException{
		
		 throw new MyException("发生MyException错误");
		
	}
	
	@PostMapping("testOther")
	public Object testOther()  throws  OtherException{
		
		 throw new OtherException("发生其他错误OtherException");
		
	}
	
	

}
