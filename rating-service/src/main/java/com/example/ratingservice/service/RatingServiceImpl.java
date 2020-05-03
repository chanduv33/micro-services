package com.example.ratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratingservice.bean.RatingBean;
import com.example.ratingservice.dao.RatingDAO;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDAO dao ;
	
	@Override
	public List<RatingBean> getRating() {
		return dao.getRating();
	}

}
