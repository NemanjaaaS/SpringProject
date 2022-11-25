package com.example.SpringProject.helloworld;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "HELLOWORLD")
public class HelloWorld {
   @javax.persistence.Id
   @Id
   @GeneratedValue
    private Long id;
    private String languageName;
    private String message;

    public HelloWorld(String languageName,String message){
        this.languageName = languageName;
        this.message = message;
    }

    public HelloWorld() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
