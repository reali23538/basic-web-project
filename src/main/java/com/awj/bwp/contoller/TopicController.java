package com.awj.bwp.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awj.bwp.entity.Topic;
import com.awj.bwp.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping(value="/topics")
	public ResponseEntity<List<Topic>> getTopics() { 
		Topic t = Topic.builder()
			.title("제목6")
			.description("설명 master")
			.author("작성자")
			.build();
		List<Topic> topics = new ArrayList<>();
		topics.add(t);
		
//		List<Topic> topics = topicService.findAll();
		return new ResponseEntity<List<Topic>>(topics, HttpStatus.OK); 
	}

	

}
