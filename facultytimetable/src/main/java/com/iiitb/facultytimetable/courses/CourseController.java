package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/by-faculty/{employeeid}")
    public ResponseEntity<List<Course>> getCourseByEmployee(@PathVariable Integer EmployeeId){
        Optional<Employee> employee=employeeService.getEmployeeByID(EmployeeId);
        if(employee==null){
            return ResponseEntity.notFound().build();
        }
        List<Course> courses = courseService.getCoursesByEmployee(employee);
        return ResponseEntity.ok(courses);
    }
}
