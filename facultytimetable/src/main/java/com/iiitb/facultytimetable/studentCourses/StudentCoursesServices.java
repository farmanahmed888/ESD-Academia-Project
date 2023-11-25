package com.iiitb.facultytimetable.studentCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCoursesServices {
    @Autowired
    public final StudentCoursesRepository studentCoursesRepository;

    public StudentCoursesServices(StudentCoursesRepository studentCoursesRepository) {
        this.studentCoursesRepository = studentCoursesRepository;
    }
    public List<StudentCourses> getStudentCourse(){
        return studentCoursesRepository.findAll();
    }
    public void addNewStudentCourse(StudentCourses studentCourses){
        studentCoursesRepository.save(studentCourses);
    }

}
