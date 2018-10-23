package com.trapyee.post.module.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PostThread {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String threadName;
	
	private String threadTitle;
	
	private Date createdOn;
	
	private Date modifiedOn;
	
	private PostThreadType threadType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	public String getThreadTitle() {
		return threadTitle;
	}
	public void setThreadTitle(String threadTitle) {
		this.threadTitle = threadTitle;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public PostThreadType getThreadType() {
		return threadType;
	}
	public void setThreadType(PostThreadType threadType) {
		this.threadType = threadType;
	}
	
}
