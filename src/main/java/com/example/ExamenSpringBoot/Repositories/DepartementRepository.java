package com.example.ExamenSpringBoot.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.ExamenSpringBoot.Entities.Departement;

public interface DepartementRepository extends CrudRepository <Departement, Long> { 
    List<Departement> findByTitle(String title); 

}
