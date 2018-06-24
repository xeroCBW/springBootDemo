package com.cbw.security.code;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class ImageCode {

	
	private BufferedImage image;
	
	private String code;
	
	private LocalDateTime expireTime;

	public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
		super();
		this.image = image;
		this.code = code;
		this.expireTime = expireTime;
	}
	
	/**
	 * 当前时间,加上过期时间
	 * @param image
	 * @param code
	 * @param expireIn
	 */
	public ImageCode(BufferedImage image, String code, int expireIn){
		this.image = image;
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
	}
	
	
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
	
	
}
