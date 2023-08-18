package com.example.demo.EveryClass;

import jakarta.persistence.Entity;

@Entity
public class Topic {
    
    @jakarta.persistence.Id
    public String id;
    public String name;
    public String description;

    Topic(String id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    Topic(){
        
    }
    
}
