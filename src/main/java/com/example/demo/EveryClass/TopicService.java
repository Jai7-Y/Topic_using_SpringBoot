package com.example.demo.EveryClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EveryInterface.TopicRepository;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> allTopics(){
        // return topics;
        List<Topic> alltopics = new ArrayList<>();
        topicRepository.findAll().forEach(alltopics::add);
        return alltopics;
    }

    public Optional<Topic> topic(String id){
        // for(int i=0;i<topics.size();i++){
        //     if(topics.get(i).id.equals(id))
        //         return topics.get(i);
        // }
        // return new Topic();
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        // this.topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic,String Id){
        // for(int i=0;i<topics.size();i++){
        //     if(topics.get(i).id.equals(Id)){
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        topicRepository.save(topic);
    }

    public void deleteTopicById(String id) {
        // for ( int index = 0 ;index <this.topics.size() ; ++index ){
        //     String currentId = this.topics.get(index).id;
        //     // If the ID matches then remove it from list and break out of loop
        //     if (currentId != null && currentId.equals(id)){
        //         System.out.println ("Removing "+ id + " at position: " + index );
        //         this.topics.remove(index--);// Decrement index as we have removed an element
        //         return ;
        //     }
        // }
        topicRepository.deleteById(id);
    }
}
