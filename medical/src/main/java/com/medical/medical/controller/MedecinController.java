package com.medical.medical.controller;

import com.medical.medical.models.Medecin;
import com.medical.medical.service.MedecinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="/api/Medecins") // This means URL's start with /demo (after Application path)
public class MedecinController {
    @Autowired // This means to get the bean called MedecinService
    // Which is auto-generated by Spring, we will use it to handle the data
    private MedecinService medecinService;


    @GetMapping(path = "/")
    public ResponseEntity<List<Medecin>> getMedecin() {
        try {
            List<Medecin> medecins = medecinService.getMedecins();
            return new ResponseEntity<>(medecins, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/")
    public ResponseEntity<Medecin> saveMedecin(@RequestBody Medecin Medecin) {
        try {
            return new ResponseEntity<>(medecinService.saveMedecin(Medecin), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/{id}")
    public Medecin getMedecinById(@PathVariable Long id) {
        return medecinService.getMedecinByID(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Long id) {
        medecinService.deleteByID(id);
    }

    @DeleteMapping(path = "/")
    public void deleteAll() {
        medecinService.deleteAll();
    }

}
