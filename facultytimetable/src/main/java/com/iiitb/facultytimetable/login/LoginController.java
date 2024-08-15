package com.iiitb.facultytimetable.login;

import com.iiitb.facultytimetable.employees.Employee;
import com.iiitb.facultytimetable.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/login")
public class LoginController {
    @Autowired
    private JwtUtil jwtUtil;
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping(path = "/getEmployeeID")
    public LoginResponse getEmployeeID(@RequestBody LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        String jwtToken=jwtUtil.generateToken(email);
        //return loginService.getEmployeeIDByEmailAndPassword(email, password);
        return new LoginResponse(loginService.getEmployeeIDByEmailAndPassword(email, password), jwtToken);
    }
}
