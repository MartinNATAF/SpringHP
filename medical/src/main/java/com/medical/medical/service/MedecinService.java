package com.medical.medical.service;

import com.medical.medical.models.Medecin;

import java.util.List;

public interface MedecinService {

    List<Medecin> getMedecins();

    Medecin getMedecinByID(Long id);

    void deleteByID(Long id);

    void deleteAll();

    Medecin saveMedecin(Medecin Medecin);

    Medecin updateMedecin(Long id, Medecin Medecin);

}