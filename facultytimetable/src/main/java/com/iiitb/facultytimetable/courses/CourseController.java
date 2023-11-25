package com.iiitb.facultytimetable.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller
//API layer
@RestController
@RequestMapping(path="/course")
public class CourseController {
    private final CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public List<Course> getCourse(){return courseService.getCourse();}
    @PostMapping
    public void  registerNewCourse(@RequestBody Course course){
        courseService.addNewCourse(course);
    }
}
