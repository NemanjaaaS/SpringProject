package com.example.SpringProject.helloworld;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HelloController {

    @GetMapping("hello-rest")
    public String hello(){
        HelloWorld helloWorld = new HelloWorld("srpski","Zdravo svete");
        return "Zdravo svete";
    }
    @RequestMapping("hello")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }



}
