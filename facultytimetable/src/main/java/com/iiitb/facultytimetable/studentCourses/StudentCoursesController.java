package com.iiitb.facultytimetable.studentCourses;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/studentcourses")
public class StudentCoursesController {
    private final StudentCoursesServices studentCoursesServices;
    @Autowired
    public StudentCoursesController(StudentCoursesServices studentCoursesServices) {
        this.studentCoursesServices = studentCoursesServices;
    }
    @GetMapping
    public List<StudentCourses> getStudentCourse(@NotNull StudentCoursesServices studentCoursesServices){
        return studentCoursesServices.getStudentCourse();
    }
    @PostMapping
    public void registerNewStudentCourse(@RequestBody StudentCourses studentCourses){
        studentCoursesServices.addNewStudentCourse(studentCourses);
    }
    @GetMapping(path = "/all/{employeeID}")
    public ResponseEntity<List<Object[]>> question2(@PathVariable Integer employeeID){
        return new ResponseEntity<>(studentCoursesServices.findStudents(employeeID), HttpStatus.OK);
    }

}
