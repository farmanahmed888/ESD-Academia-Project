package com.iiitb.facultytimetable.specialisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller
//API layer
@RestController
@RequestMapping(path = "/specialisation")
public class SpecialisationController {
    public SpecialisationService specialisationService;
    @Autowired
    public SpecialisationController(SpecialisationService specialisationService){
        this.specialisationService=specialisationService;
    }
    @GetMapping
    public List<Specialisation> getSpecialisation(){return  specialisationService.getSpecialisation();}
    @PostMapping
    public void postSpecialisation(@RequestBody Specialisation specialisation){ specialisationService.addNewSpecialisation(specialisation);}
}
