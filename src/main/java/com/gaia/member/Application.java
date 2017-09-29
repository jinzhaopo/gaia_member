package com.gaia.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@ImportResource("classpath:applicationContext-*.xml")
@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = { "com.nt.framework", "com.gaia" })
@ServletComponentScan(basePackages = { "com.nt.framework", "com.gaia.member" })
@MapperScan(basePackages = { "com.gaia.survey.member","com.nt.framework" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
