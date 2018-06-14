package com.cbw.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MyUserDetailsService  implements UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		System.out.println("用户名为:" + userName);
		
		//对123456进行加密,同一个密码;但是每次结果不一样
		String password = passwordEncoder.encode("123456");
		System.out.println("数据库密码是:" + password);

		//初步设置密码
		return new User(userName, password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
		
		//设置用户名和密码
	}
}
