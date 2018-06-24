package com.cbw.security.code;

import org.springframework.security.core.AuthenticationException;

/**
 * 自定义一个类,来实现过滤器
 * @author cbw
 *
 */
public class ValidateCodeException extends AuthenticationException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValidateCodeException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
