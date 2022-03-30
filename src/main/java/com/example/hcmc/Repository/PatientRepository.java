package com.example.hcmc.Repository;

import com.example.hcmc.Model.Patient;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface PatientRepository extends MongoRepository<Patient,String> {

    List<Patient> findByOrderByFullNames();
    @Query("select a from patient a where a.dateOfBirth <= :elderYear")
    List<Patient> findallElderPatient(
            @Param("elderYear") Date elderYear);



}
