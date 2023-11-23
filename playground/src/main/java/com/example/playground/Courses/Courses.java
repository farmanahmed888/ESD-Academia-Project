package com.example.playground.Courses;

public class Courses {
    private Integer Course_ID;
    private Integer Course_Code;
    private String Name;
    private String Description;
    private Integer Year;
    private Integer Term;
    private Integer Credits;
    private Integer Capacity;
    private Integer Faculty;

    public Courses() {
    }

    public Courses(Integer course_ID, Integer course_Code, String name, String description, Integer year, Integer term, Integer credits, Integer capacity, Integer faculty) {
        Course_ID = course_ID;
        Course_Code = course_Code;
        Name = name;
        Description = description;
        Year = year;
        Term = term;
        Credits = credits;
        Capacity = capacity;
        Faculty = faculty;
    }

    public Courses(Integer course_Code, String name, String description, Integer year, Integer term, Integer credits, Integer capacity, Integer faculty) {
        Course_Code = course_Code;
        Name = name;
        Description = description;
        Year = year;
        Term = term;
        Credits = credits;
        Capacity = capacity;
        Faculty = faculty;
    }

    public Integer getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(Integer course_ID) {
        Course_ID = course_ID;
    }

    public Integer getCourse_Code() {
        return Course_Code;
    }

    public void setCourse_Code(Integer course_Code) {
        Course_Code = course_Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Integer getTerm() {
        return Term;
    }

    public void setTerm(Integer term) {
        Term = term;
    }

    public Integer getCredits() {
        return Credits;
    }

    public void setCredits(Integer credits) {
        Credits = credits;
    }

    public Integer getCapacity() {
        return Capacity;
    }

    public void setCapacity(Integer capacity) {
        Capacity = capacity;
    }

    public Integer getFaculty() {
        return Faculty;
    }

    public void setFaculty(Integer faculty) {
        Faculty = faculty;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "Course_ID=" + Course_ID +
                ", Course_Code=" + Course_Code +
                ", Name=" + Name +
                ", Description=" + Description +
                ", Year=" + Year +
                ", Term=" + Term +
                ", Credits=" + Credits +
                ", Capacity=" + Capacity +
                ", Faculty=" + Faculty +
                '}';
    }
}
