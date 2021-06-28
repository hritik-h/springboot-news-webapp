package com.NewProject.demo3.controller;

import com.NewProject.demo3.entities.Post;
import com.NewProject.demo3.repository.PostRepository;
import com.NewProject.demo3.service.PostService;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    public PostService postService;
    @RequestMapping("/a")
    public ModelAndView home(ModelAndView model){
        List<Post> posts = postService.getAllPost();
        Gson gson = new Gson();
        String jsonString = gson.toJson(posts);
        System.out.println(jsonString);
        model.addObject("jsonString" ,posts);
        model.setViewName("index.html");
        return model;
    }
    @PostMapping(value = "/a/post")
    public String post(@RequestBody Post item){
        System.out.println("Done 2");
        System.out.println(item.toString());
        postService.post(item);
        return "Successful";
    }

    @PostMapping(value = "/a/action-page")
    public String post(HttpServletRequest request){
        System.out.println(request.getParameter("title"));
        System.out.println(request.getParameter("description"));
        Post post = new Post();
        post.setTitle(request.getParameter("title"));
        post.setText(request.getParameter("description"));
        postService.post(post);
        return "Sucessful";
    }
    @RequestMapping("/thymeleaf")
    public String thyme(Model model){
        model.addAttribute("list", postService.getAllPost());
        model.addAttribute("name","Hritik Singh");
        return ("about");
    }

    @GetMapping("/a/single/{id}")
    public String single(@PathVariable long id, Model model){
        Post post = postService.getPostById(id);
        model.addAttribute("title", post.getTitle());
        model.addAttribute("description", post.getText());
        model.addAttribute("id",post.getId());
        return ("single");
    }

    @GetMapping("/a/delete/{id}")
    public RedirectView delete(@PathVariable long id){
        postService.deletePost(id);
        return new RedirectView("/a");
    }
}
