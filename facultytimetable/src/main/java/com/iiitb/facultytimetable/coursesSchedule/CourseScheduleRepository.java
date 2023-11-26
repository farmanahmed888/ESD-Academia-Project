package com.iiitb.facultytimetable.coursesSchedule;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CourseScheduleRepository extends JpaRepository<CourseSchedule,Integer>, CrudRepository<CourseSchedule,Integer> {
    @Query("select cs,c " +
            "from CourseSchedule cs join cs.course c join cs.course.employee emp " +
            "where cs.course.employee.employeeID=:input")
    List<Object[]> getCourseName(Integer input);


}
