package com.cbw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 设置认证拦截
 * @author cbw
 *
 */
@Component
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter{
	
//	Consider defining a bean of type 'org.springframework.security.crypto.password.PasswordEncoder' in your configuration.

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//自动从properties 来注解
	@Autowired
	private SecurityProperties securityProperties;

	//在这里配置,yaml文件没有用
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//设置认证
		
		http.formLogin()
		.and()
		.authorizeRequests()
		.anyRequest()
		.authenticated();
		
		
		//设置登录
		
//		http.formLogin()
//		.loginPage("/authentication/require")
//		.loginProcessingUrl("/authentication/form")
////	http.httpBasic()
//		.and()
//		.authorizeRequests()
//		.antMatchers("/authentication/require",
//				securityProperties.getBrowser().getLoginPage()).permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.csrf().disable();
		
	}
	
	
}
