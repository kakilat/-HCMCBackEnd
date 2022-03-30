package com.example.hcmc.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    private String patientId;
    private String patientNumber;
    private Boolean isAnOutPatient;
    private String fullNames;
    private String emailAddress;
    private String contactPhoneNumber;
    private LocalDate dateOfBirth;





}
