package com.iiitb.facultytimetable.courses;

import com.iiitb.facultytimetable.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>, CrudRepository<Course,Integer> {
    List<Course> findCourseByEmployee(@Param("employee") Optional<Employee> employee);
}
