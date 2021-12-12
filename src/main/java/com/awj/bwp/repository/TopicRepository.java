package com.awj.bwp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awj.bwp.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
