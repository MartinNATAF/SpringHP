package com.medical.medical.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "consultation")
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_consult;
    @Column(name = "tarif")
    private String tarif;
    @Column(name = "ordonance")
    private String ordonance;
    @OneToOne @JoinColumn(name="idRdv", nullable=false)
    private Rdv rdv;

    public Consultation() {
    }

    public Consultation(String tarif, String ordonance, Rdv rdv) {
        this.tarif = tarif;
        this.ordonance = ordonance;
        this.rdv = rdv;
    }
}
