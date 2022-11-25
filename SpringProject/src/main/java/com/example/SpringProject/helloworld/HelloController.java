package com.example.SpringProject.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
   @Autowired
   private HelloWorldRepo repo;

    @GetMapping("hello-rest")
    public String hello(){
        HelloWorld helloWorld = new HelloWorld("srpski","Zdravo svete");
        return "Zdravo svete";
    }
    @GetMapping("hello/{name}")
    public String getHelloByName(@PathVariable(value = "name") String name){

        return repo.findByLanguageName(name).getMessage();

    }




}
