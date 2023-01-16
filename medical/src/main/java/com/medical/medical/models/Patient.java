package com.medical.medical.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


@Entity
@Table(name = "patient")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_patient;
    public Long getId_patient() {
        return id_patient;
    }

    @Column(name = "nom_patient")
    private String nom_patient;
    @Column(name = "prnm_patient")
    private String prnm_patient;
    @Column(name = "date_naissance")
    private String date_naissance;
    @Column(name = "adresse_patient")
    private String adresse_patient;
    @Column(name = "tel_patient")
    private String tel_patient;

    @OneToMany( targetEntity=Rdv.class, mappedBy="patient" )
    private List<Rdv> rdv = new ArrayList<>();

    @JsonIgnore
    public List<Rdv> getRdvs() {
        return rdv;
    }

    public Patient(List<Rdv> rdv) {
        this.rdv = rdv;
    }

    public Patient() {
    }

    public Patient(String nom_patient, String prnm_patient, String date_naissance, String adresse_patient,
            String tel_patient) {
        this.nom_patient = nom_patient;
        this.prnm_patient = prnm_patient;
        this.date_naissance = date_naissance;
        this.adresse_patient = adresse_patient;
        this.tel_patient = tel_patient;
    }

    public String getTel_patient() {
        return tel_patient;
    }

    

    public void setTel_patient(String tel_patient) {
        this.tel_patient = tel_patient;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getPrnm_patient() {
        return prnm_patient;
    }

    public void setPrnm_patient(String prnm_patient) {
        this.prnm_patient = prnm_patient;
    }

    public String getNom_patient() {
        return nom_patient;
    }

    public void setNom_patient(String nom_patient) {
        this.nom_patient = nom_patient;
    }

    public String getAdresse_patient() {
        return adresse_patient;
    }

    public void setAdresse_patient(String adresse_patient) {
        this.adresse_patient = adresse_patient;
    }
}
