package com.trapyee.post.module.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trapyee.post.module.model.Post;

@Repository
public interface PostResourceRepository extends JpaRepository<Post, Long>{

}
