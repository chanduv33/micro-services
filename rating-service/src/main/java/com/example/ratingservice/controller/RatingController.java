package com.example.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingservice.bean.RatingBean;
import com.example.ratingservice.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService service;
	
	@GetMapping(path = "getRating", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RatingBean> getRating() {
		return service.getRating();
	}
}
