package com.yihecloud.controller;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class IndexController extends SpringBootServletInitializer {


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
    public Map<String, Object> mytest() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Ryan");
        map.put("age", "3");
        map.put("sex", "man");
        return map;
    }
}