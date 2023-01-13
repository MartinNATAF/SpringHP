package com.medical.medical.service;

import com.medical.medical.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatients();

    Patient getPatientByID(Long id);

    void deleteByID(Long id);

    void deleteAll();

    Patient savePatient(Patient Patient);

    Patient updatePatient(Long id, Patient Patient);

}
