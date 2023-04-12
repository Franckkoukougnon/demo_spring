package com.example_spring.demo_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ItemController {

    @GetMapping("/welcome")
    public static void getHome(){

        System.out.println("Welcome Home");
    }

    @GetMapping("/afficherMot")
    public String afficherMot(@RequestParam(defaultValue = "test") String mot) {
        System.out.println(mot);
        return mot;
    }
    @GetMapping("/reverse")
    public String reverse(@RequestParam(defaultValue =" Simplon" ) String mot){
        StringBuilder reverseWord = new StringBuilder(mot).reverse();
        return reverseWord.toString();
    }


    @GetMapping("/page1")
    public String pages1(){
        return " Bienvenue su la page 1";
    }

    @GetMapping ("/item")
    public Person addItem(){
        Person person = new Person();
        person.setAge(30);
        person.setName("Simplon");
        person.setMetier("Codeur");

        return  person;
    }

    @GetMapping("/list")
    public List<String> listItem(){
        List<String> value = new ArrayList<>();
        value.add("Value 1");
        value.add("Value 2");
        value.add("Value 3");
        value.add("Value 4");
        value.add("Value 5");


        return value;
    }


    class Person {
        int age;
        String name;
        String metier;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMetier() {
            return metier;
        }

        public void setMetier(String metier) {
            this.metier = metier;
        }
    }
}
