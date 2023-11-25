package com.iiitb.facultytimetable.coursesSchedule;

import com.iiitb.facultytimetable.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScheduleRepository extends JpaRepository<CourseSchedule,Integer>, CrudRepository<CourseSchedule,Integer> {

}
