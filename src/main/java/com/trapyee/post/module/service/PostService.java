package com.trapyee.post.module.service;

import java.util.List;

import com.trapyee.post.module.response.PostRequest;
import com.trapyee.post.module.response.PostResponse;

public interface PostService {

	public PostResponse createPost(PostRequest postRequest);

	public List<PostResponse> getMainPosts();
	
}
