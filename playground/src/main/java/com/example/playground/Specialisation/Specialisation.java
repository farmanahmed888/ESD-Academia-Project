package com.example.playground.Specialisation;

import java.time.Year;

public class Specialisation {
    private Integer Specialisation_ID;
    private Integer Code;
    private String Name;
    private String Description;
    private Year Year;
    private Integer Credits_Required;

    public Specialisation() {
    }

    public Specialisation(Integer specialisation_ID, Integer code, String name, String description, java.time.Year year, Integer credits_Required) {
        Specialisation_ID = specialisation_ID;
        Code = code;
        Name = name;
        Description = description;
        Year = year;
        Credits_Required = credits_Required;
    }

    public Integer getSpecialisation_ID() {
        return Specialisation_ID;
    }

    public void setSpecialisation_ID(Integer specialisation_ID) {
        Specialisation_ID = specialisation_ID;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
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

    public java.time.Year getYear() {
        return Year;
    }

    public void setYear(java.time.Year year) {
        Year = year;
    }

    public Integer getCredits_Required() {
        return Credits_Required;
    }

    public void setCredits_Required(Integer credits_Required) {
        Credits_Required = credits_Required;
    }

    @Override
    public String toString() {
        return "Specialisation{" +
                "Specialisation_ID=" + Specialisation_ID +
                ", Code=" + Code +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Year=" + Year +
                ", Credits_Required=" + Credits_Required +
                '}';
    }
}
