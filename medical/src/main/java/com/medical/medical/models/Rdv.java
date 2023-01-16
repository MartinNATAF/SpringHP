package com.medical.medical.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rdv")
public class Rdv implements Serializable {
    

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rdv;
    @Column(name = "date_rdv")
    private String date_rdv;

    public String getDate_rdv() {
        return date_rdv;
    }

    public void setDate_rdv(String date_rdv) {
        this.date_rdv = date_rdv;
    }

    @Column(name = "heure_rdv")
    private String heure_rdv;
    public String getHeure_rdv() {
        return heure_rdv;
    }

    public void setHeure_rdv(String heure_rdv) {
        this.heure_rdv = heure_rdv;
    }

    @ManyToOne 
    @JoinColumn(name="idMedecin", nullable=false)
    private Medecin medecin;

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @ManyToOne 
    @JoinColumn(name="idPatient", nullable=false)
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Rdv() {
    }  
}
