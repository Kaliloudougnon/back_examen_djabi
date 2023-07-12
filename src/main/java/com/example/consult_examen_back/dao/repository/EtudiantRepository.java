package com.example.consult_examen_back.dao.repository;

import com.example.consult_examen_back.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author kdougnon
 */
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findEtudiantByNumPlaceAndSession(long numPlace,long session);
    List<Etudiant> findAllByAcademieAndSession(String academie,long session);
}
