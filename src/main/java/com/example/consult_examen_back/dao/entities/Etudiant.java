package com.example.consult_examen_back.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kdougnon
 */
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long numPlace;
    private String name;
    private String lastName;
    private String sexe;
    private String etablissement;
    private String annnee_naissance;
    private String academie;
    private String statut;
    private String mention;
    private String serie;
    private long session;


}
