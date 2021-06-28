package com.newsblog.editpost.controller;


import com.newsblog.editpost.entities.Post;
import com.newsblog.editpost.service.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    public EditService editService;


    @PostMapping(value = "/edit-post")
    public String post(@RequestBody Post item){
        System.out.println("Done 2");
        System.out.println(item.toString());
        editService.edit(item);
        return "Successful";
    }
}
