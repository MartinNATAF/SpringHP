package com.medical.medical.service;

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
        //Rdv _Rdv = new Rdv();
        //_Rdv.setTitle(Rdv.getTitle());
        //_Rdv.setAuthor(Rdv.getAuthor());
        //_Rdv.setPrice(Rdv.getPrice());
        //_Rdv.setCategory();
        //RdvDAO.save(_Rdv);
        //return _Rdv;
        return RdvDAO.save(Rdv); // plus rapide mais bon...
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