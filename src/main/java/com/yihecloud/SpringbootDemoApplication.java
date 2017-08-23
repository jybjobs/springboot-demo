package com.yihecloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@SpringBootApplication
public class SpringbootDemoApplication {

//	@Value("${index.hello}")  //注入properties or yaml  值
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
