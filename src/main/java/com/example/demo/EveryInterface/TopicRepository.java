package com.example.demo.EveryInterface;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.EveryClass.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {
    
}
