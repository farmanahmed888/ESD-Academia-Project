package com.iiitb.facultytimetable.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//data access layer
//access database
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    //select * from Student where id==input.id
    Optional<Student> findStudentByRollNumber(Integer Id);
}
