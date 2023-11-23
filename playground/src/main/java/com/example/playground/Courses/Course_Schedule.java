package com.example.playground.Courses;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Course_Schedule {
    private Integer Course_Schedule_ID;
    private Integer Course_Code;
    private LocalTime Time;
    private DayOfWeek Day;
    private Integer Room;
    private String Building;

    public Course_Schedule() {
    }

    public Course_Schedule(Integer course_Code, LocalTime time, DayOfWeek day, Integer room, String building) {
        Course_Code = course_Code;
        Time = time;
        Day = day;
        Room = room;
        Building = building;
    }

    public Course_Schedule(Integer course_Schedule_ID, Integer course_Code, LocalTime time, DayOfWeek day, Integer room, String building) {
        Course_Schedule_ID = course_Schedule_ID;
        Course_Code = course_Code;
        Time = time;
        Day = day;
        Room = room;
        Building = building;
    }

    public Integer getCourse_Schedule_ID() {
        return Course_Schedule_ID;
    }

    public void setCourse_Schedule_ID(Integer course_Schedule_ID) {
        Course_Schedule_ID = course_Schedule_ID;
    }

    public Integer getCourse_Code() {
        return Course_Code;
    }

    public void setCourse_Code(Integer course_Code) {
        Course_Code = course_Code;
    }

    public LocalTime getTime() {
        return Time;
    }

    public void setTime(LocalTime time) {
        Time = time;
    }

    public DayOfWeek getDay() {
        return Day;
    }

    public void setDay(DayOfWeek day) {
        Day = day;
    }

    public Integer getRoom() {
        return Room;
    }

    public void setRoom(Integer room) {
        Room = room;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    @Override
    public String toString() {
        return "Course_Schedule{" +
                "Course_Schedule_ID=" + Course_Schedule_ID +
                ", Course_Code=" + Course_Code +
                ", Time=" + Time +
                ", Day=" + Day +
                ", Room=" + Room +
                ", Building='" + Building + '\'' +
                '}';
    }
}
