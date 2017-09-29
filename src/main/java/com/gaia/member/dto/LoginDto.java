package com.gaia.member.dto;

import java.io.Serializable;

/**
 * 
 * @ClassName: LoginDto
 * @Description: 登入后的传输的bean(member,company)
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月29日 下午2:37:21
 */
public class LoginDto implements Serializable {
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
