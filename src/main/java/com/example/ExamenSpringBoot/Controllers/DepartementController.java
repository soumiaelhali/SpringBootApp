package com.example.ExamenSpringBoot.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ExamenSpringBoot.Entities.Departement;
import com.example.ExamenSpringBoot.Repositories.DepartementRepository;

@Controller
@RequestMapping("/departement/")
public class DepartementController {

	   private final DepartementRepository departementRepository;

	    @Autowired
	    public DepartementController(DepartementRepository departementRepository) {
	        this.departementRepository = departementRepository;
	    }

	    @RequestMapping("add")
	    public String showSignUpForm(Departement departement) {
	        return "add-departement";
	    }

	    @RequestMapping("list")
	    public String showUpdateForm(Model model) {
	        model.addAttribute("departements", departementRepository.findAll());
	        return "departement";
	    }

	    @PostMapping("addd")
	    public String addDepartement(@ModelAttribute Departement departement, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            return "null";
	        }
	        departementRepository.save(departement);
	        return "departement";
	    }
	    
	    /*
	   @GetMapping("edit/{id}")
	    public String showUpdateForm(@PathVariable("id") long id, Model model) {
	    	Departement departement = departementRepository.findById(id)
	            .orElseThrow(() - > new IllegalArgumentException("Invalid Departement Id:" + id));
	        model.addAttribute("departement", departement);
	        return "update-departement";
	    }

	    @PostMapping("update/{id}")
	    public String updateStudent(@PathVariable("id") long id, @Valid Departement departement, BindingResult result,
	        Model model) {
	        if (result.hasErrors()) {
	        	departement.setId(id);
	            return "update-departement";
	        }

	        departementRepository.save(departement);
	        model.addAttribute("departements", departementRepository.findAll());
	        return "departement";
	    }

	    @GetMapping("delete/{id}")
	    public String deleteDepartement(@PathVariable("id") long id, Model model) {
	    	Departement departement = departementRepository.findById(id)
	            .orElseThrow(() - > new IllegalArgumentException("Invalid departement Id:" + id));
	    	departementRepository.delete(departement);
	        model.addAttribute("departements", departementRepository.findAll());
	        return "departement";
	    }*/
}
