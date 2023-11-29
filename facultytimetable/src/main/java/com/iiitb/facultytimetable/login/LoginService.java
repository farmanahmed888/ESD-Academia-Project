package com.iiitb.facultytimetable.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public Integer getEmployeeIDByEmailAndPassword(String email, String password){
        Login login=loginRepository.findByEmailAndPassword(email,password);
        if (login != null) {
            return login.getEmployeeID();
        } else {
            // Handle the case when no matching login is found (e.g., return null, throw an exception, etc.)
            return -1;
        }
    }

}
