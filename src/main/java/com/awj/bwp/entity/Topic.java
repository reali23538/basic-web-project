package com.awj.bwp.entity;

import java.util.Date;

import javax.persistence.*;
import lombok.*;

@Data
@Entity 
public class Topic {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql의 AUTO_INCREMENT를 그대로 사용 
	private Long id; 
	
	@Column
	private String title; 

	@Column
	private String description; 
	
	@Column
	private String author; 
	
	@Column
	private Date created;
	
//	public Topic () {};
//	
	@Builder
	public Topic (String title, String description, String author) {
		this.title = title;
		this.description = description;
		this.author = author;
		this.created = new Date();
	}

}

