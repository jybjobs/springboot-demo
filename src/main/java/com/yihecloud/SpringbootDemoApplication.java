package com.yihecloud;

import com.yihecloud.entity.Customer;
import com.yihecloud.service.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
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


	/**
	 * ｊｐａ　操作　mysql数据库
	 * 可以用于初始化数据
	 */
//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
//		};
//	}
}
