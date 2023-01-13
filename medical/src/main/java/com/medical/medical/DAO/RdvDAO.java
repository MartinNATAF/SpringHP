package com.medical.medical.DAO;

import com.medical.medical.models.Rdv;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RdvDAO extends CrudRepository<Rdv, Long> {

}