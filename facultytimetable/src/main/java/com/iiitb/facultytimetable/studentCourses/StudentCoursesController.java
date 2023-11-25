package com.iiitb.facultytimetable.studentCourses;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

}
