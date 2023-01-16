package com.medical.medical.service;

import com.medical.medical.DAO.MedecinDAO;
import com.medical.medical.DAO.PatientDAO;
import com.medical.medical.DAO.RdvDAO;
import com.medical.medical.models.Rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RdvServiceImpl implements RdvService{
    @Autowired
    private RdvDAO RdvDAO;

    @Override
    public List<Rdv> getRdvs() {
        List<Rdv> RdvS = (List<Rdv>) RdvDAO.findAll();
        if(!RdvS.isEmpty()){
            return RdvS;
        }else {
            return null;
        }
    }

    @Override
    public Rdv getRdvByID(Long id) {
        Optional<Rdv> _Rdv = RdvDAO.findById(id);
        if(_Rdv.isPresent()) {
            return _Rdv.get();
        }else {
            return null;
        }
    }
    @Override
    public Rdv saveRdv(Rdv Rdv){
        Rdv rdvtest = new Rdv();
        rdvtest.setDate_rdv(Rdv.getDate_rdv());
        System.out.println("A");
        rdvtest.setHeure_rdv(Rdv.getHeure_rdv());
        System.out.println("B");
        rdvtest.setMedecin(Rdv.getMedecin());
        System.out.println("C");
        rdvtest.setPatient(Rdv.getPatient());
        System.out.println("D");
        return RdvDAO.save(rdvtest);
    }

    @Override
    public Rdv updateRdv(Long id, Rdv Rdv) {
        Optional<Rdv> retrievedRdv = RdvDAO.findById(id);
        RdvDAO.save(retrievedRdv.get());
        return retrievedRdv.get();
    }

    @Override
    public void deleteByID(Long id) {
        RdvDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        RdvDAO.deleteAll();
    }

}