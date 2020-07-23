package com.example.ExamenSpringBoot.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable  {

	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	 
	    @Column(nullable = false, unique = true)
	    public String name;
	 

	    @Column(nullable = false, unique = true)
	    public String email;
	    

	    @Column(nullable = false, unique = true)
	    public String password;
	    
	    
	    public void setId(long id) {
	        this.id = id;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }


	    public String getName() {
	        return name;
	    }
	    
	 
	
	    @ManyToOne
	    @JoinColumn(name="departement_id", referencedColumnName="id",nullable=false,unique=true)
	    private Departement departement;
	    
	    @ManyToOne
	    @JoinColumn(name="remuneration_id", referencedColumnName="id",nullable=false,unique=true)
	    private Remuneration remuneration;
	 
	    public Employee() {
	    }
}
