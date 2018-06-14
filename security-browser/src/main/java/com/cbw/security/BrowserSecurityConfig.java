package com.cbw.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * 设置认证拦截
 * @author cbw
 *
 */
@Component
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter{

	//在这里配置,yaml文件没有用
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//设置认证
		
		http.formLogin()
		.and()
		.authorizeRequests()
		.anyRequest()
		.authenticated();
	}
	
	
}
