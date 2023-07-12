package com.example.consult_examen_back.web;


import com.example.consult_examen_back.dao.entities.Etudiant;
import com.example.consult_examen_back.dao.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HP
 */
@RestController
@CrossOrigin("*")
public class EtudiantController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping("etudiant/{numPlace}/{session}")
    public Etudiant getEtudiantByNumPlace(@PathVariable long numPlace,@PathVariable long session){
      return etudiantRepository.findEtudiantByNumPlaceAndSession(numPlace,session);
    }@GetMapping("allEtudiant/{academie}/{session}")
    public List<Etudiant> getAllEtudiant(@PathVariable String academie,@PathVariable long session){
      return etudiantRepository.findAllByAcademieAndSession(academie,session);
    }
}
