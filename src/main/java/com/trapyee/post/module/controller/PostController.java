package com.trapyee.post.module.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class PostController {
	
	@Autowired
	DiscoveryClient discoveryClient;

	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public void fetchAllEmployees() throws RestClientException, IOException {
		List<ServiceInstance> instances = discoveryClient.getInstances("trapyee-zuul-service");
		ServiceInstance serviceInstance = instances.get(0);

		String baseUrl = serviceInstance.getUri().toString();

		baseUrl = baseUrl + "/employeeapi/employee";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(response.getBody());
	}
	
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", org.springframework.http.MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<Object>(headers);
	}
}
