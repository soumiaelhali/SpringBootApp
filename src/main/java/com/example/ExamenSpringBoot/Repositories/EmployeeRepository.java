package com.example.ExamenSpringBoot.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.ExamenSpringBoot.Entities.Employee;

public interface EmployeeRepository extends CrudRepository <Employee, Long> {
	List<Employee> findByEmail(String email);
}