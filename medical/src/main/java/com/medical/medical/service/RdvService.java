package com.medical.medical.service;

import com.medical.medical.models.Rdv;

import java.util.List;

public interface RdvService {
    List<Rdv> getRdvs();

    Rdv getRdvByID(Long id);

    void deleteByID(Long id);

    void deleteAll();

    Rdv saveRdv(Rdv rdv);

    Rdv updateRdv(Long id, Rdv rdv);

}