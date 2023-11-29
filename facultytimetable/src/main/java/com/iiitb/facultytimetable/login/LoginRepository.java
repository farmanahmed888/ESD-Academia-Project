package com.iiitb.facultytimetable.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {
    Login findByEmailAndPassword(String email,String password);
}
