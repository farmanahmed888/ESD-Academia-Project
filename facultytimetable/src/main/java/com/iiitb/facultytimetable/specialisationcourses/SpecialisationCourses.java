package com.iiitb.facultytimetable.specialisationcourses;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.specialisation.Specialisation;
import jakarta.persistence.*;

@Entity
@Table
public class SpecialisationCourses {
    @Id
    private Integer specialisationCoursesID;

    public SpecialisationCourses() {
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_courseCode")
    private Course course;
    @ManyToOne
    @JoinColumn(name ="specialisationID")
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
