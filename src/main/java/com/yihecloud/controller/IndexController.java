package com.yihecloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IndexController.class);
    }

    @RequestMapping("/")
    @ResponseBody
    String home(@RequestParam(name="name") String name) {
        System.out.println("hello,"+name);
        return "Hello !"+name;
    }

    @RequestMapping("/health")
    @ResponseBody
    String health() {
        System.out.println("health !");
        return "{\"status\":\"true\"}";
    }

}