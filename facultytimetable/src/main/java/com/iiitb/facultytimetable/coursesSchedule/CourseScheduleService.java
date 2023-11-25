package com.iiitb.facultytimetable.coursesSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseScheduleService {
    @Autowired
    public final CourseScheduleRepository courseScheduleRepository;

    public CourseScheduleService(CourseScheduleRepository courseScheduleRepository) {
        this.courseScheduleRepository = courseScheduleRepository;
    }
    public List<CourseSchedule> getCourse(){
        return courseScheduleRepository.findAll();
    }
    public void addNewCourseSchedule(CourseSchedule courseSchedule){
        courseScheduleRepository.save(courseSchedule);
    }
}
