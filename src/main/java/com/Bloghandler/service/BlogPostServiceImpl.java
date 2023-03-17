package com.Bloghandler.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	import com.Bloghandler.dao.BlogPostRepository;
	import com.Bloghandler.model.BlogPost;

	//BlogPostServiceImpl.java

	@Service
	public class BlogPostServiceImpl implements BlogPostService {

		@Autowired
		private final BlogPostRepository blogPostRepository;

		public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
			this.blogPostRepository = blogPostRepository;
		}

		@Override
		public Iterable<BlogPost> findAll() {
			return blogPostRepository.findAll();
		}

		@Override
		public Optional<BlogPost> findById(Long id) {
			return blogPostRepository.findById(id);
		}

		@Override
		public BlogPost save(BlogPost blogPost) {
			return blogPostRepository.save(blogPost);
		}

		@Override
		public void deleteById(Long id) {
			blogPostRepository.deleteById(id);
		}

		@Override
		public BlogPost update(Integer id, BlogPost blogPost) {
			blogPost.setId(blogPost.getId());
			blogPost.setContent(blogPost.getContent());
			blogPost.setPublishedAt(blogPost.getPublishedAt());
			blogPost.setTitle(blogPost.getTitle());
		
			return this.blogPostRepository.save(blogPost);
		}

	}


