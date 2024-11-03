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
                new Course(3, "Scam Course", "Fraud Academy"),
                new Course(4, "Dummy Course", "Doe Academy"),
                new Course(5, "Placeholder Course", "Deux Institute"),
                new Course(6, "Placeholder Book0", "Deux Institute new")
        );
    }
}
