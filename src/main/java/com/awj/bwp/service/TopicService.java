package com.awj.bwp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awj.bwp.entity.Topic;
import com.awj.bwp.repository.TopicRepository;

@Service
public class TopicService {
	
//	@Autowired
//	private TopicRepository topicRepository;
	
	public List<Topic> findAll() {

//		return topicRepository.findAll();
		return new ArrayList<>();
	}

}
