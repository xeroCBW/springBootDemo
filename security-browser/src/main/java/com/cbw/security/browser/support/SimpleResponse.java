package com.cbw.security.browser.support;

public class SimpleResponse {

	private String content;
	
	// 设置响应体
	public SimpleResponse(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
