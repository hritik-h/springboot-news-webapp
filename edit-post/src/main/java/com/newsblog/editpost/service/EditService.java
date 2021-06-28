package com.newsblog.editpost.service;

import com.newsblog.editpost.entities.Post;
import com.newsblog.editpost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditService {
    @Autowired
    PostRepository postRepository;

    public void edit(Post post){
        postRepository.save(post);
    }
}
