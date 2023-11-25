package com.iiitb.facultytimetable.studentCourses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCoursesRepository extends JpaRepository<StudentCourses,Integer> {
}
