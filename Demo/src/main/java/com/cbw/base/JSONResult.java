package com.cbw.base;

import java.io.Serializable;

public class JSONResult implements Serializable {
	
	/**
	 * 设置序列号的Id
	 */
	private static final long serialVersionUID = 5356066570685405131L;
	
	private String code;
	private String retMsg;
	private Object data;
	
	
//	创建构造方法
	public JSONResult() {
		super();
	}

	public JSONResult(String code, String retMsg) {
		super();
		this.code = code;
		this.retMsg = retMsg;
	}

	public JSONResult(String code, String retMsg, Object data) {
		super();
		this.code = code;
		this.retMsg = retMsg;
		this.data = data;
	}
	
	
//	创建setter 和 getter 方法
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	
	
	
}
