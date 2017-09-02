package com.yihecloud.controller;

import com.yihecloud.entity.Customer;
import com.yihecloud.entity.CustomerRepository;
import com.yihecloud.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController extends SpringBootServletInitializer {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ICustomerService iCustomerService;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IndexController.class);
    }


    @RequestMapping("/")
    @ResponseBody
    String home() {
        System.out.println("hello !");
        return "Hello !";
    }

    /**
     * 从redis中存取数据
     * @param model
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(Model model) {
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        operations.set("hello","hello,springboot.");
        model.addAttribute("hello",operations.get("hello"));
        return "index";
    }

    /**
     *从mysql 中读取数据
     * @return
     */
    @RequestMapping(value = "json")
    @ResponseBody
    public  Iterable<Customer> getCustomers() {
        Iterable<Customer> customers = customerRepository.findAll();
//        logger.debug(customers.toString());
        return customers;
    }

    /**
     * redis 缓存
     * @param id
     * @return
     */
    @RequestMapping(value = "customer")
    @ResponseBody
    public  Customer getCustomer(Long id) {
//        logger.debug(customers.toString());
        return iCustomerService.findById(id);
    }
}