package com.yihecloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@RestController
@SpringBootApplication  //开启自动配置
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //关闭特定自动配置
//@ImportResource({"classpath:spring-context.xml","classpath:mybatis-context.xml"}) 加载xml
public class SpringbootDemoApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringbootDemoApplication.class);
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
