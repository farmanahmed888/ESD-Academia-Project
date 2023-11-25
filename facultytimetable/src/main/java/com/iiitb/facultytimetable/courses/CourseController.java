package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller
//API layer
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
    @GetMapping
    public List<Course> getCourse(){return courseService.getCourse();}
    @PostMapping
    public void  registerNewCourse(@RequestBody Course course){
        courseService.addNewCourse(course);
    }
    @GetMapping("/courses/by-faculty/{facultyId}")
    public ResponseEntity<List<Course>> getCoursesByEmployee(@PathVariable Integer facultyId) {
        // Retrieve the Faculty entity from the database
        Employee employee = employeeService.getEmployeeyById(facultyId);

        if (employee == null) {
            // Faculty not found
            return ResponseEntity.notFound().build();
        }

        // Retrieve the courses for the given faculty
        List<Course> courses = courseService.getCoursesByEmployee(employee);

        return ResponseEntity.ok(courses);
    }
}
