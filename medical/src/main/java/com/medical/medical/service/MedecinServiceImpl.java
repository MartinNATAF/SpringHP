package com.medical.medical.service;

import com.medical.medical.DAO.MedecinDAO;
import com.medical.medical.models.Medecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinServiceImpl implements MedecinService{

    @Autowired
    private MedecinDAO medecinDAO;

    @Override
    public List<Medecin> getMedecins() {
        System.out.println("atozeee");
        List<Medecin> Medecins = (List<Medecin>) medecinDAO.findAll();
        System.out.println("atozeeeBIS");
        if(!Medecins.isEmpty()){
            return Medecins;
        }else {
            return null;
        }
    }

    @Override
    public Medecin getMedecinByID(Long id) {
        Optional<Medecin> _Medecin = medecinDAO.findById(id);
        if(_Medecin.isPresent()) {
            return _Medecin.get();
        }else {
            return null;
        }
    }
    @Override
    public Medecin saveMedecin(Medecin Medecin){
        System.out.println("Bloup.444.");
        return medecinDAO.save(Medecin);
    }

    @Override
    public Medecin updateMedecin(Long id, Medecin Medecin) {
        Optional<Medecin> retrievedMedecin = medecinDAO.findById(id);
        medecinDAO.save(retrievedMedecin.get());
        return retrievedMedecin.get();
    }

    @Override
    public void deleteByID(Long id) {
        medecinDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        medecinDAO.deleteAll();
    }

}
