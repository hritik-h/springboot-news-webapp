package com.register.login.controller;

import com.register.login.entities.User;
import com.register.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @Autowired
    UserService userService;


    @GetMapping("/register")
    public String register(Model model){
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(HttpServletRequest request){
        User user = new User();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setEmail(request.getParameter("email"));
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setPassword(encoder.encode(request.getParameter("password")));


        userService.Save(user);

        return "successful";
    }
}
