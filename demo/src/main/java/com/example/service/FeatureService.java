package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Feature;
import com.example.demo.repository.FeatureRepository;

public class FeatureService {
	
	@Autowired
	FeatureRepository featureRepository;
	
	public Feature addToRepo(Feature feature)
	{
		return featureRepository.save(feature);
	}

}
