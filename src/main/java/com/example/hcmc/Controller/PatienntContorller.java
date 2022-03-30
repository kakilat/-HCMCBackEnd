package com.example.hcmc.Controller;

import com.example.hcmc.Model.Patient;
import com.example.hcmc.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/patient")
public class PatienntContorller {
    @Autowired
    PatientService patientService;
    @GetMapping("/all")
    public List<Patient> listOfPatient(){
        return patientService.patientListOrderdByName();
    }

    @PostMapping("/save")
    public  Patient  savePatient(@RequestBody  Patient patient){
        return  patientService.savePatient(patient);
    }

    @GetMapping("/elders")
    public  List<Patient>  elderPatients() throws ParseException {

            return patientService.elderPatients();


    }
}
