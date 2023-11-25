package com.iiitb.facultytimetable.specialisation;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table
public class Specialisation {
    @Id
    private Integer specialisationID;
    @Column(unique = true,nullable = false)
    private Integer code;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private Year year;
    @Column(nullable = false)
    private Integer creditsRequired;

    public Specialisation() {
    }

    public Specialisation(Integer specialisationID, Integer code, String name, String description, Year year, Integer creditsRequired) {
        this.specialisationID = specialisationID;
        this.code = code;
        this.name = name;
        this.description = description;
        this.year = year;
        this.creditsRequired = creditsRequired;
    }

    public Specialisation(Integer code, String name, String description, Year year, Integer creditsRequired) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.year = year;
        this.creditsRequired = creditsRequired;
    }

    public Integer getSpecialisationID() {
        return specialisationID;
    }

    public void setSpecialisationID(Integer specialisationID) {
        this.specialisationID = specialisationID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Integer getCreditsRequired() {
        return creditsRequired;
    }

    public void setCreditsRequired(Integer creditsRequired) {
        this.creditsRequired = creditsRequired;
    }

    @Override
    public String toString() {
        return "Specialisation{" +
                "specialisationID=" + specialisationID +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", creditsRequired=" + creditsRequired +
                '}';
    }
}
