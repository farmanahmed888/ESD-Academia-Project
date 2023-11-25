package com.iiitb.facultytimetable.coursesSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/courseschedule")
public class CourseScheduleController {
    private final CourseScheduleService courseScheduleService;
    @Autowired
    public CourseScheduleController(CourseScheduleService courseScheduleService) {
        this.courseScheduleService = courseScheduleService;
    }
    @GetMapping
    public List<CourseSchedule> getCourse(){return courseScheduleService.getCourse();}
    @PostMapping
    public  void registerNewCourseSchedule(@RequestBody CourseSchedule courseSchedule){
        courseScheduleService.addNewCourseSchedule(courseSchedule);
    }
}
