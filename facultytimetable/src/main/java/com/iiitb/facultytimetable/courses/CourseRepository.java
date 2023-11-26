package com.iiitb.facultytimetable.courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>, CrudRepository<Course,Integer> {
    @Query("select c.name from Course c  where c.employee.employeeID=:empID")
    List<Object[]> getAllCourses(Integer empID);
}
