package com.learn_spring_boot.learnspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class CourseControllerJava {

    @GetMapping("/courses")
    public List<CourseJava> retrieveAllCourses()  {
        return Arrays.asList(new CourseJava(1, "Learn AWS", "in28minutes"),new CourseJava(2, "Learn DevOps", "in28minutes"));
    }
}
