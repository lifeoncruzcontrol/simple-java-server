package com.example.models;

public class User {
    private String id;
    private String name;

    // Constructor
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    // Setters and getters for JSON serialization
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}