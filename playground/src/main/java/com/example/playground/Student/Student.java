package com.example.playground.Student;

public class Student {
    private Integer Student_ID;
    private Integer Roll_Number;
    private String First_Name;
    private String Last_Name;
    private String Photograph_Path;
    private Integer Cgpa;
    private Integer Total_Credits;
    private Integer Graduation_Year;

    public Student() {
    }

    public Student(Integer student_ID, Integer roll_Number, String first_Name, String last_Name, String photograph_Path, Integer cgpa, Integer total_Credits, Integer graduation_Year) {
        Student_ID = student_ID;
        Roll_Number = roll_Number;
        First_Name = first_Name;
        Last_Name = last_Name;
        Photograph_Path = photograph_Path;
        Cgpa = cgpa;
        Total_Credits = total_Credits;
        Graduation_Year = graduation_Year;
    }

    public Student(Integer roll_Number, String first_Name, String last_Name, String photograph_Path, Integer cgpa, Integer total_Credits, Integer graduation_Year) {
        Roll_Number = roll_Number;
        First_Name = first_Name;
        Last_Name = last_Name;
        Photograph_Path = photograph_Path;
        Cgpa = cgpa;
        Total_Credits = total_Credits;
        Graduation_Year = graduation_Year;
    }

    public Integer getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(Integer student_ID) {
        Student_ID = student_ID;
    }

    public Integer getRoll_Number() {
        return Roll_Number;
    }

    public void setRoll_Number(Integer roll_Number) {
        Roll_Number = roll_Number;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getPhotograph_Path() {
        return Photograph_Path;
    }

    public void setPhotograph_Path(String photograph_Path) {
        Photograph_Path = photograph_Path;
    }

    public Integer getCgpa() {
        return Cgpa;
    }

    public void setCgpa(Integer cgpa) {
        Cgpa = cgpa;
    }

    public Integer getTotal_Credits() {
        return Total_Credits;
    }

    public void setTotal_Credits(Integer total_Credits) {
        Total_Credits = total_Credits;
    }

    public Integer getGraduation_Year() {
        return Graduation_Year;
    }

    public void setGraduation_Year(Integer graduation_Year) {
        Graduation_Year = graduation_Year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_ID=" + Student_ID +
                ", Roll_Number=" + Roll_Number +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Photograph_Path='" + Photograph_Path + '\'' +
                ", Cgpa=" + Cgpa +
                ", Total_Credits=" + Total_Credits +
                ", Graduation_Year=" + Graduation_Year +
                '}';
    }
}
