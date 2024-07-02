package com.example.learn_SpringBoot_First_REST_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Courses")
public class CouseController {
    @RequestMapping("/All-Courses")
    public List<Course> returnAllCourses(){
        return Arrays.asList( new Course(1, "Physics", "Swami"),
                new Course(2, "Maths", "Vivek"),
                new Course(3,"AWS","Self Learning"));

    }

    @GetMapping("/Hello")
    public String WelcomePage(){
        return "Welcome Guys";
    }


}
