package com.example.SpringProject.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepo extends JpaRepository<HelloWorld,Long> {

    HelloWorld findByLanguageName(String name);
}
