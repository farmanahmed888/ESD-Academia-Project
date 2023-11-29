package com.iiitb.facultytimetable.login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Login {
    @Id
    private Integer employeeID;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String password;

    public Login() {
    }

    public Login(Integer employeeID, String email, String password) {
        this.employeeID = employeeID;
        this.email = email;
        this.password = password;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "employeeID=" + employeeID +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
