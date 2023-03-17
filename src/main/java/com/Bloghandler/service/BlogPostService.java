package com.Bloghandler.service;

import java.util.Optional;

import com.Bloghandler.model.BlogPost;

public interface BlogPostService {
	public Iterable<BlogPost> findAll();

	Optional<BlogPost> findById(Long id);

	BlogPost save(BlogPost blogPost);
	
	BlogPost update(Integer id, BlogPost blogPost);

	void deleteById(Long id);
	
}

