package com.cbw.web.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbw.dto.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class TestController {
	
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello spring security";
	}

	@PutMapping(value="/update")
	@ApiOperation("修改对象")
	public Object update(@Valid @RequestBody User user,BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			bindingResult.getAllErrors().stream().forEach(error -> {
				// FieldError fieldError = (FieldError)error;
				// String message = fieldError.getField() +" "+
				// error.getDefaultMessage();
				System.out.println(error.getDefaultMessage());
			});
		}

		System.out.println(user.getId());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getBirthday());

		user.setId("1");
		
		return user;
	}
	
	@PostMapping(value="/get")
	@ApiOperation("获取对象")
	public User get(@Valid @RequestBody User user,BindingResult bindingResult) {
		
		user.setId("1");
		
		return user;
	}
	
	
	@PostMapping(value="/delete")
	@ApiOperation("删除对象")
	public Object delete(@Valid @RequestBody User user,BindingResult bindingResult) {
		
		user.setId("1");
		
		return user;
	}

}
