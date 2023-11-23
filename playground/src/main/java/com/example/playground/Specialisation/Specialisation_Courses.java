package com.example.playground.Specialisation;

public class Specialisation_Courses {
    private Integer Specialisation_Courses_ID;

    public Specialisation_Courses() {
    }

    public Specialisation_Courses(Integer specialisation_Courses_ID) {
        Specialisation_Courses_ID = specialisation_Courses_ID;
    }

    public Integer getSpecialisation_Courses_ID() {
        return Specialisation_Courses_ID;
    }

    public void setSpecialisation_Courses_ID(Integer specialisation_Courses_ID) {
        Specialisation_Courses_ID = specialisation_Courses_ID;
    }

    @Override
    public String toString() {
        return "Specialisation_Courses{" +
                "Specialisation_Courses_ID=" + Specialisation_Courses_ID +
                '}';
    }
}
