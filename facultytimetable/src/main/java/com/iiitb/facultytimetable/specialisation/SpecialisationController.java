package com.iiitb.facultytimetable.specialisation;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.courses.CourseService;
import com.iiitb.facultytimetable.employees.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller
//API layer
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/specialisation")
public class SpecialisationController {
    private final CourseService courseService;
    public SpecialisationService specialisationService;
    @Autowired
    public SpecialisationController(CourseService courseService, SpecialisationService specialisationService){
        this.courseService = courseService;
        this.specialisationService=specialisationService;
    }
    @GetMapping
    public List<Specialisation> getSpecialisation(){return  specialisationService.getSpecialisation();}
    @PostMapping
    public void postSpecialisation(@RequestBody Specialisation specialisation){ specialisationService.addNewSpecialisation(specialisation);}
}
