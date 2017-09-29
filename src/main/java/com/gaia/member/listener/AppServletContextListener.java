package com.gaia.member.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.nt.framework.Setting;

/**
 * 
 * @ClassName: AppServletContextListener
 * @Description: 初始化一些数据
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年9月25日 下午4:36:30
 */
@WebListener
public class AppServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {

	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
