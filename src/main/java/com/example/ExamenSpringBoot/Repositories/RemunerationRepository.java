package com.example.ExamenSpringBoot.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ExamenSpringBoot.Entities.Remuneration;

public interface RemunerationRepository extends CrudRepository <Remuneration, Long>{
	List<Remuneration> findByTitle(String title);
}
