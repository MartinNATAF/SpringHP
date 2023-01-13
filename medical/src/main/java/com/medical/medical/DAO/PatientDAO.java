package com.medical.medical.DAO;

import com.medical.medical.models.Patient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientDAO extends CrudRepository<Patient, Long> {
}
