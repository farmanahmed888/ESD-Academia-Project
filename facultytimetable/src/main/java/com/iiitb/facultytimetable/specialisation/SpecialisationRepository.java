package com.iiitb.facultytimetable.specialisation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialisationRepository extends JpaRepository<Specialisation,Integer> {
    //Optional<Specialisation> findSpecialisationByCode(Integer code);
}
