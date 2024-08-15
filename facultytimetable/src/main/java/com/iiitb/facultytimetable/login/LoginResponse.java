package com.iiitb.facultytimetable.login;

public class LoginResponse {
    private Integer employeeId;
    private String jwtToken;

    public LoginResponse(Integer employeeId, String jwtToken) {
        this.employeeId = employeeId;
        this.jwtToken = jwtToken;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
