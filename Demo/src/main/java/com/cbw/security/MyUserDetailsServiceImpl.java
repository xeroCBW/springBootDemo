package com.cbw.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.cbw.mappers.UserMapper;

//把他变成一个componet,这个时候就可以用mapper;已经给spring来进行管辖了;
//相当于service,mapper或者其他的东西
@Component
public class MyUserDetailsServiceImpl implements UserDetailsService {
	
	
	private static final Logger logger = LoggerFactory.getLogger(MyUserDetailsServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		logger.info("用户登录名:"+username+"-----------");
		
		//遇到两个一样的user的时候,需要将user设置成username
		com.cbw.dto.User user = userMapper.selectByUsername(username);
		String password = user.getPassword();
		
		//根据用户名查找用户信息
		//实现了user方法
		//public class User implements UserDetails, CredentialsContainer 
		//设置成admin,admin是权限
		User userResult = new User(username,password,AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
		
		return userResult;
	}

}
