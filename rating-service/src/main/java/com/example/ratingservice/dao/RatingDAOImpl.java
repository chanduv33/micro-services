package com.example.ratingservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ratingservice.bean.RatingBean;

@Repository
public class RatingDAOImpl implements RatingDAO {

	private static List<RatingBean> beans = new ArrayList<RatingBean>();
	
	static {
		beans.add(new RatingBean(1, 4.5));
		beans.add(new RatingBean(2, 3.5));
	}
	 
	
	@Override
	public List<RatingBean> getRating() {
		return beans;
	}

}
