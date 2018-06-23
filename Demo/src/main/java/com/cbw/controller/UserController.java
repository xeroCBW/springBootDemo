package com.cbw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbw.dto.User;
import com.cbw.exception.MyException;
import com.cbw.exception.OtherException;
import com.cbw.service.UserService;
import com.cbw.util.JSONResultUtil;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("delete")
	private Object deleteByPrimaryKey(Long uid) {

		
		int flag = userService.deleteByPrimaryKey(uid);
		
		if (flag == 1) {
			return JSONResultUtil.setSuccess();
		}else {
			return JSONResultUtil.setError("S00001", "删除失败");
		}
		
		
	}

	@RequestMapping("insert")
	private Object insert(User record) {

		return userService.insert(record);
	}
	
	@RequestMapping("query")
	public Object selectByPrimaryKey(Long uid) {
		
		User user = userService.selectByPrimaryKey(uid);
		
		return JSONResultUtil.setSuccess(user);

	}
	
	@RequestMapping("queryList")
	public Object queryList(Long uid) {

		return null;
	}

	@RequestMapping("update")
	public Object updateByPrimaryKeySelective(User record) {

		return userService.updateByPrimaryKey(record);
	}
	


}
