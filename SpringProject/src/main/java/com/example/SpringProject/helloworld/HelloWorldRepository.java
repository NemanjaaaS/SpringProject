package com.example.SpringProject.helloworld;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelloWorldRepository extends CrudRepository<HelloWorld,Integer> {

    HelloWorld findById(int id);
    List<HelloWorld> findAll();
    HelloWorld findByName(String name);
}
