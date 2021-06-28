package com.NewProject.demo3.service;

import com.NewProject.demo3.entities.Post;
import com.NewProject.demo3.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    public PostRepository postRepository;

    public List<Post> getAllPost(){
        return postRepository.findAll();
    }
    public void post(Post post){
        postRepository.save(post);
    }

    public Post getPostById(long id){
        return postRepository.getById(id);
    }

    public void deletePost(long id){
         postRepository.deleteById(id);
    }
}
