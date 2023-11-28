package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.employees.EmployeeService;
import com.iiitb.facultytimetable.specialisationcourses.SpecialisationCourses;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

//controller
//API layer
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/course")
public class CourseController {
    private final CourseService courseService;
    private final EmployeeService employeeService;

    @Autowired
    public CourseController(CourseService courseService, EmployeeService employeeService) {
        this.courseService = courseService;
        this.employeeService = employeeService;
    }
    @GetMapping(path = "/all/{courseID}")
    public List<Object[]> abc(@PathVariable Integer courseID){
        return courseService.getCourses(courseID);
    }
}
