package com.medical.medical.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;


@Entity
@Table(name = "medecin")
public class Medecin implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_medecin;
    
    public Long getId_medecin() {
        return id_medecin;
    }


    @Column(name = "nom_medecin")
    private String nom_medecin;
    public String getNom_medecin() {
        return nom_medecin;
    }


    public void setNom_medecin(String nom_medecin) {
        this.nom_medecin = nom_medecin;
    }


    @Column(name = "prnm_medecin")
    private String prnm_medecin;
    public String getPrnm_medecin() {
        return prnm_medecin;
    }


    public void setPrnm_medecin(String prnm_medecin) {
        this.prnm_medecin = prnm_medecin;
    }


    @Column(name = "date_naissance")
    private String date_naissance;
    public String getDate_naissance() {
        return date_naissance;
    }


    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }


    @Column(name = "adresse_medecin")
    private String adresse_medecin;
    public String getAdresse_medecin() {
        return adresse_medecin;
    }


    public void setAdresse_medecin(String adresse_medecin) {
        this.adresse_medecin = adresse_medecin;
    }


    @Column(name = "tel_medecin")
    private String tel_medecin;
    public String getTel_medecin() {
        return tel_medecin;
    }


    public void setTel_medecin(String tel_medecin) {
        this.tel_medecin = tel_medecin;
    }


    @Column(name = "specialite_medecin")
    private String specialite_medecin;

    public String getSpecialite_medecin() {
        return specialite_medecin;
    }


    public void setSpecialite_medecin(String specialite_medecin) {
        this.specialite_medecin = specialite_medecin;
    }


    @OneToMany( targetEntity=Rdv.class, mappedBy="medecin" )
    private List<Rdv> rdv = new ArrayList<>();

    public Medecin() {
    }


    @JsonIgnore
    public List<Rdv> getRdvs() {
        return rdv;
    }


    public void setRdvs(List<Rdv> rdv) {
        this.rdv = rdv;
    }


    public Medecin(String nom_medecin, String prnm_medecin, String date_naissance, String adresse_medecin,
            String tel_medecin, String specialite_medecin) {
        this.nom_medecin = nom_medecin;
        this.prnm_medecin = prnm_medecin;
        this.date_naissance = date_naissance;
        this.adresse_medecin = adresse_medecin;
        this.tel_medecin = tel_medecin;
        this.specialite_medecin = specialite_medecin;
    }
}
