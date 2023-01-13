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
    @Column(name = "heure_rdv")
    private String heure_rdv;
    @ManyToOne @JoinColumn(name="idMedecin", nullable=false)
    private Medecin medecin;
    @ManyToOne @JoinColumn(name="idPatient", nullable=false)
    private Patient patient;

    public Rdv(String date_rdv, String heure_rdv, Medecin medecin, Patient patient) {
        this.date_rdv = date_rdv;
        this.heure_rdv = heure_rdv;
        this.medecin = medecin;
        this.patient = patient;
    }
}
