package com.iiitb.facultytimetable.studentCourses;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.student.Student;
import jakarta.persistence.*;

@Entity
@Table
public class StudentCourses {
    @Id
    private Integer studentCoursesId;
    @ManyToOne
    @JoinColumn(name = "studentID")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    public StudentCourses() {
    }

    public StudentCourses(Integer studentCoursesId) {
        this.studentCoursesId = studentCoursesId;
    }

    public Integer getStudentCoursesId() {
        return studentCoursesId;
    }

    public void setStudentCoursesId(Integer studentCoursesId) {
        this.studentCoursesId = studentCoursesId;
    }

    @Override
    public String toString() {
        return "StudentCourses{" +
                "studentCoursesId=" + studentCoursesId +
                '}';
    }
}
