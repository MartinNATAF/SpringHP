package com.medical.medical.DAO;

import com.medical.medical.models.Medecin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedecinDAO extends CrudRepository<Medecin, Long> {
    
}