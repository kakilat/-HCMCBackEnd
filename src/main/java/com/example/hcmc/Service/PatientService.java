package com.example.hcmc.Service;

import com.example.hcmc.Model.Patient;
import com.example.hcmc.Repository.PatientRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class PatientService {
    @Autowired(required = false)
    private  PatientRepository patientRepository;


    public List<Patient>  patientListOrderdByName(){
        return  patientRepository.findByOrderByFullNames();
    }
    public  Patient  savePatient(Patient patient){
        return  patientRepository.save(patient);
    }

    @SneakyThrows
    public List<Patient> elderPatients() {
        List<Patient> patientList = patientRepository.findallElderPatient(
                new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01"));

        return patientList;
    }

    }


