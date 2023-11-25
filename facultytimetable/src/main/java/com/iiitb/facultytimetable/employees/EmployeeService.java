package com.iiitb.facultytimetable.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployee(){return  employeeRepository.findAll();}
    public void addNewEmployee(Employee employee){
        employeeRepository.save(employee);
    }


    public Optional<Employee> getEmployeeByID(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }
}
