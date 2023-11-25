package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    public final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> getCourse(){return  courseRepository.findAll();}
    public void addCourse(Course course){
        courseRepository.save(course);
    }


    public void addNewCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getCoursesByEmployee(Optional<Employee> employee) {
        return courseRepository.findCourseByEmployee(employee);
    }
}
