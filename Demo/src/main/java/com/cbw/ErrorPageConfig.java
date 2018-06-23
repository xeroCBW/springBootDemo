package com.cbw;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
	
	/**
	 * 配置404
	 * 
	 * 如果使用themeleaft 就不需要用这个,因为他会去找默认的东西
	 * 
	 * @return
	 */
	 @Bean
	    public EmbeddedServletContainerCustomizer containerCustomizer() {

	        return (container -> {
	            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
	            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
	            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

	            container.addErrorPages(error401Page, error404Page, error500Page);
	        });
	    }
	
	

}
