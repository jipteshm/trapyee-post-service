package com.trapyee.post.module.response;

import java.util.ArrayList;
import java.util.List;

public class AbstractResponse<T> {
	
	private String error;
	
	private String success;
	
	List<T> responses = new ArrayList<T>();

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<T> getResponses() {
		return responses;
	}

	public void setResponses(List<T> responses) {
		this.responses = responses;
	}

	
	
}
