package com.iiitb.facultytimetable.specialisation;

import com.iiitb.facultytimetable.courses.Course;
import jakarta.persistence.*;

@Entity
@Table
public class SpecialisationCourses {
    @Id
    private Integer specialisationCoursesID;

    public SpecialisationCourses() {
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coursecourseCode",nullable = false)
    private Course course;
    @ManyToOne
    @JoinColumn(name ="specialisationID",nullable = false)
    private Specialisation specialisation;

    public SpecialisationCourses(Integer specialisationCoursesID) {
        this.specialisationCoursesID = specialisationCoursesID;
    }

    public Integer getSpecialisationCoursesID() {
        return specialisationCoursesID;
    }

    public void setSpecialisationCoursesID(Integer specialisationCoursesID) {
        this.specialisationCoursesID = specialisationCoursesID;
    }

    @Override
    public String toString() {
        return "SpecialisationCourses{" +
                "specialisationCoursesID=" + specialisationCoursesID +
                '}';
    }
}
