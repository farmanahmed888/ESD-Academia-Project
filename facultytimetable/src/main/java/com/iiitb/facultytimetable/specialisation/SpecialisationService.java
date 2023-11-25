package com.iiitb.facultytimetable.specialisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//service layer
//business logic
@Service
public class SpecialisationService {
    @Autowired
    private final SpecialisationRepository specialisationRepository;

    public SpecialisationService(SpecialisationRepository specialisationRepository) {
        this.specialisationRepository = specialisationRepository;
    }
    public List<Specialisation> getSpecialisation(){
        return specialisationRepository.findAll();
    }
    public void addNewSpecialisation(Specialisation specialisation){

        specialisationRepository.save(specialisation);
    }
}
