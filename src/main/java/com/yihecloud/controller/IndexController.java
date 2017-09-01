package com.yihecloud.controller;

import com.yihecloud.entity.Customer;
import com.yihecloud.service.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class IndexController extends SpringBootServletInitializer {

    @Autowired
    private CustomerRepository customerRepository;



    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IndexController.class);
    }


    @RequestMapping("/")
    @ResponseBody
    String home() {
        System.out.println("xxxxxxxxxxxxx");
        return "Hello 22!";
    }


    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("hello","hello,springboot.");
        return "index";
    }


    @RequestMapping(value = "json")
    @ResponseBody
    public  Iterable<Customer> getCustomer() {
        Iterable<Customer> customers = customerRepository.findAll();
//        logger.debug(customers.toString());
        return customers;
    }
}