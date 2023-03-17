package com.Bloghandler.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bloghandler.model.BlogPost;

	//BlogPostRepository.java
	@Repository
	public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
		
	}

