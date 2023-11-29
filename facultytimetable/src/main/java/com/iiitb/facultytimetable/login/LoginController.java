package com.iiitb.facultytimetable.login;

import com.iiitb.facultytimetable.employees.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping(path = "/getEmployeeID")
    public Integer getEmployeeID(@RequestBody LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        return loginService.getEmployeeIDByEmailAndPassword(email, password);
    }
}
