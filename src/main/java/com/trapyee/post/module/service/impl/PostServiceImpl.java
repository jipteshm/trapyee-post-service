package com.trapyee.post.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trapyee.post.module.model.Post;
import com.trapyee.post.module.repo.PostResourceRepository;
import com.trapyee.post.module.response.PostRequest;
import com.trapyee.post.module.response.PostResponse;
import com.trapyee.post.module.service.PostService;

public class PostServiceImpl implements PostService{

	@Autowired
	PostResourceRepository postResouceRepository;;
	
	@Override
	public PostResponse createPost(PostRequest postRequest) {
		// TODO Auto-generated method stub
		Post post = new Post();
		post.setMainTitle(postRequest.getMainTitle());
		post.setSubTitle(postRequest.getSubTitle());
		post.setContent(postRequest.getContent());
		post.setPostType(postRequest.getPostType());
		postResouceRepository.save(post);
		return null;
	}

	@Override
	public List<PostResponse> getMainPosts() {
		// TODO Auto-generated method stub
		List <Post> post = postResouceRepository.findAll();
		
		
		
		return null;
	}

}
