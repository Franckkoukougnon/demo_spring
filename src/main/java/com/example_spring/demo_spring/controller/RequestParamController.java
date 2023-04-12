package com.example_spring.demo_spring.controller;


import com.example_spring.demo_spring.model.ItemModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestParamController {
    @GetMapping("/itemsList")
    public List<ItemModel> getItem(@RequestParam int count){
        List<ItemModel> items = new ArrayList<>();
        for (int i = 1; i <= count; i++){
            items.add(new ItemModel("ItemModel " + i));
        }
        return items;
    }

    @GetMapping("/bonjour")
    public String multiPAram(@RequestParam String id, @RequestParam( required = false) String name){

        if(name == null){
            return "Bonjour " + id + ", mais ou est diantre name ?";

        }
        return "Bonjour "+ id +", quel beau temps pour "+ name;
    }


}
