package com.phearun.rest;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phearun.model.Post;

@RestController
public class PostController {

	@PostMapping("/posts")
	public Post saveUser(@Valid @RequestBody Post post){
		System.out.println(post);
		return post;
	}
	
	
}
