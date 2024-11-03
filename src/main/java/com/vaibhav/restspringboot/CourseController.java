package com.vaibhav.restspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    /* /courses
    * Course : id, name, author */

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Spring and Spring Boot", "in28minutes"),
                new Course(2, "Java Masterclass", "Tim Bachulka"),
                new Course(3, "Scam Course", "Fraud Academy")
        );
    }
}
