package com.tts.TechTalentBlog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BlogPostController {
	
	@Autowired
    private BlogPostRepository blogPostRepository;
	
	private static List<BlogPost> posts = new ArrayList<>();
	
	@GetMapping(value="/")
	public String index(BlogPost blogpost, Model model) {
			model.addAttribute("posts", posts);
			return "blogpost/index";
		
		    }
	 
	
	
	@GetMapping(value = "/blogposts/new")
	public String newBlog (BlogPost blogPost) {
	    return "blogpost/new";
	}
	    
    @PostMapping(value = "/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
	blogPostRepository.save(blogPost);
	posts.add(blogPost);
	model.addAttribute("title", blogPost.getTitle());
	model.addAttribute("author", blogPost.getAuthor());
	model.addAttribute("blogEntry", blogPost.getBlogEntry());
	return "blogpost/result";
    }
}
