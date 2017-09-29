package com.gaia.member.controller;

import org.apache.catalina.core.StandardContext;

import com.gaia.member.dto.LoginDto;

/**
 * 
 * @ClassName: BaseController
 * @Description: 项目基础的controller
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月29日 下午2:23:27
 */
public abstract class BaseController extends StandardContext {

	/**
	 * 
	 * @Title: getLoginDto
	 * @Description: TODO 获取登入后的信息,这个方法在对接ceo的时候会重写,调用dubbo获取,配上拦截器去拦截
	 * @return
	 * @return: LoginDto
	 */
	public LoginDto getLoginDto() {
		LoginDto ld = new LoginDto();
		return ld;
	}

}
