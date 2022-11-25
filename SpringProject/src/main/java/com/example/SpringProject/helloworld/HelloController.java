package com.example.SpringProject.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HelloController {
   @Autowired
   private HelloWorldRepo repo;

    @GetMapping("hello-rest")
    public String hello(){

        return "Zdravo svete";
    }
    @GetMapping("hello/{name}")
    public String getHelloByName(@PathVariable(value = "name") String name){

        return repo.findByLanguageName(name).getMessage();

    }

    @RequestMapping("secure/hello")
    public String securityHello(){
        return "Secure Hello World USER!";
    }


}





