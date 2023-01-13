package com.medical.medical.service;

import com.medical.medical.DAO.PatientDAO;
import com.medical.medical.models.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientDAO PatientDAO;

    @Override
    public List<Patient> getPatients() {
        List<Patient> PatientS = (List<Patient>) PatientDAO.findAll();
        if(!PatientS.isEmpty()){
            return PatientS;
        }else {
            return null;
        }
    }

    @Override
    public Patient getPatientByID(Long id) {
        Optional<Patient> _Patient = PatientDAO.findById(id);
        if(_Patient.isPresent()) {
            return _Patient.get();
        }else {
            return null;
        }
    }
    @Override
    public Patient savePatient(Patient Patient){
        //Patient _Patient = new Patient();
        //_Patient.setTitle(Patient.getTitle());
        //_Patient.setAuthor(Patient.getAuthor());
        //_Patient.setPrice(Patient.getPrice());
        //_Patient.setCategory();
        //PatientDAO.save(_Patient);
        //return _Patient;
        return PatientDAO.save(Patient); // plus rapide mais bon...
    }

    @Override
    public Patient updatePatient(Long id, Patient Patient) {
        Optional<Patient> retrievedPatient = PatientDAO.findById(id);
        PatientDAO.save(retrievedPatient.get());
        return retrievedPatient.get();
    }

    @Override
    public void deleteByID(Long id) {
        PatientDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        PatientDAO.deleteAll();
    }

}