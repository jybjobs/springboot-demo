package com.yihecloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@SpringBootApplication  //开启自动配置
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) 关闭特定自动配置
//@ImportResource({"classpath:spring-context.xml","classpath:mybatis-context.xml"}) 加载xml
public class SpringbootDemoApplication {

//	@Value("${pros.hello}")  //注入properties or yaml  值
//	private  String hello;
//	@Autowired
//	private PropertSettings propertSettings;
//
//	@RequestMapping("/")
//	String index(){
//		return  propertSettings.getHello();
//	}

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
