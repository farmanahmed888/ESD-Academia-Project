package com.iiitb.facultytimetable.studentCourses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCoursesRepository extends JpaRepository<StudentCourses,Integer> {
    @Query("select cs.student from StudentCourses cs join cs.student s join cs.course c where cs.course.employee.employeeID=:employeeID")
    List<Object[]> findStudentsByEmployeeID(Integer employeeID);
}
