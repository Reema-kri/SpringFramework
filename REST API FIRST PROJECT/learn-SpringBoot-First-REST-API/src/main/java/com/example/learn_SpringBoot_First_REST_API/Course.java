package com.example.learn_SpringBoot_First_REST_API;

import org.springframework.stereotype.Component;


public class Course {
    private int ID;
    private String Name;
    private String Author;
    public Course(int ID, String Name, String Author){
        super();
        this.ID = ID;
        this.Name = Name;
        this.Author = Author;
    }

    public int getID() {
        return ID;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

// Getters are importatnt to include so that Spring can convert it into JSON easily.

}
