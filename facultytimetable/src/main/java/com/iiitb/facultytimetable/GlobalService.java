package com.iiitb.facultytimetable;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.courses.CourseRepository;
import com.iiitb.facultytimetable.courses.CourseService;
import com.iiitb.facultytimetable.coursesSchedule.CourseSchedule;
import com.iiitb.facultytimetable.coursesSchedule.CourseScheduleRepository;
import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.employees.EmployeeRepository;
import com.iiitb.facultytimetable.employees.EmployeeService;
import com.iiitb.facultytimetable.specialisation.Specialisation;
import com.iiitb.facultytimetable.specialisation.SpecialisationRepository;
import com.iiitb.facultytimetable.student.Student;
import com.iiitb.facultytimetable.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlobalService {
    @Autowired
    private final StudentRepository studentRepository;
    public GlobalService(StudentRepository studentRepository, SpecialisationRepository specialisationRepository, EmployeeRepository employeeRepository, CourseScheduleRepository courseScheduleRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.specialisationRepository = specialisationRepository;
        this.employeeRepository = employeeRepository;
        this.courseScheduleRepository = courseScheduleRepository;
        this.courseRepository = courseRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByRollNumber(student.getRollNumber());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("student rollnumber taken");
        }
        studentRepository.save(student);
    }
    @Autowired
    private final SpecialisationRepository specialisationRepository;
    public List<Specialisation> getSpecialisation(){
        return specialisationRepository.findAll();
    }
    public void addNewSpecialisation(Specialisation specialisation){

        specialisationRepository.save(specialisation);
    }
    @Autowired
    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){return  employeeRepository.findAll();}
    public void addNewEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    @Autowired
    public final CourseScheduleRepository courseScheduleRepository;
    public List<CourseSchedule> getCourse(){
        return courseScheduleRepository.findAll();
    }
    public void addNewCourseSchedule(CourseSchedule courseSchedule){
        courseScheduleRepository.save(courseSchedule);
    }
    @Autowired
    public CourseRepository courseRepository;

    public void CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void addNewCourse(Course course) {
        courseRepository.save(course);
    }

}
