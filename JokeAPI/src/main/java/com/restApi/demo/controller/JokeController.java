package com.restApi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restApi.demo.JokeService;

@RestController
public class JokeController {


	@Autowired
	private JokeService service;
	
	@GetMapping("/jokes")
	public String getJoke()
	{
		
	return 	this.service.getJokes();
		
	}
	















}
