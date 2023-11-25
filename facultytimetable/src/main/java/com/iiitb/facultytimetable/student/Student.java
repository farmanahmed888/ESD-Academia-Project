package com.iiitb.facultytimetable.student;

import com.iiitb.facultytimetable.specialisation.Specialisation;
import jakarta.persistence.*;
//data structure
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Integer studentID;

    @Column(nullable = false,unique = true)
    private Integer rollNumber;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private Double cgpa;
    private Integer totalCredits;
    private Integer graduationYear;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "specialisationID")
    private Specialisation specialisation;
    public Student() {
    }

    public Student(Integer studentID, Integer rollNumber, String firstName, String lastName, Double cgpa, Integer totalCredits, Integer graduationYear) {
        this.studentID = studentID;
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.totalCredits = totalCredits;
        this.graduationYear = graduationYear;
    }

    public Student(Integer rollNumber, String firstName, String lastName, Double cgpa, Integer totalCredits, Integer graduationYear) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.totalCredits = totalCredits;
        this.graduationYear = graduationYear;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", totalCredits=" + totalCredits +
                ", graduationYear=" + graduationYear +
                '}';
    }
}
