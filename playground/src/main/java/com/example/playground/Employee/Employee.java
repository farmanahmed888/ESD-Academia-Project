package com.example.playground.Employee;

public class Employee {
    private Integer Employee_ID;
    private String First_Name;
    private String Last_Name;
    private String Email;
    private String Title;
    private String Photograph_Path;

    public Employee() {
    }

    public Employee(Integer employee_ID, String first_Name, String last_Name, String email, String title, String photograph_Path) {
        Employee_ID = employee_ID;
        First_Name = first_Name;
        Last_Name = last_Name;
        Email = email;
        Title = title;
        Photograph_Path = photograph_Path;
    }

    public Integer getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(Integer employee_ID) {
        Employee_ID = employee_ID;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPhotograph_Path() {
        return Photograph_Path;
    }

    public void setPhotograph_Path(String photograph_Path) {
        Photograph_Path = photograph_Path;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_ID=" + Employee_ID +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Title='" + Title + '\'' +
                ", Photograph_Path='" + Photograph_Path + '\'' +
                '}';
    }
}
