package com.tts.TechTalentBlog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlogPost {
	
	@Id
//	sets the primary key for id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id; 
    private String title;
    private String author;
    private String blogEntry;
    
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title; 
        this.author = author;
	this.blogEntry = blogEntry;
    }
    public BlogPost() {
    	this.title = "undefined";
    	this.author = "unknow";
    	this.blogEntry = "undefined";
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}
    
    

}
