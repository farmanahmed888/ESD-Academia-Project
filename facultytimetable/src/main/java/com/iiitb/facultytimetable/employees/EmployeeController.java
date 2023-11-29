package com.iiitb.facultytimetable.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller
//API layer
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }
}
