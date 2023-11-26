package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    public final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Object[]> getCourses(Integer courseID){
        return courseRepository.getAllCourses(courseID);
    }


}
