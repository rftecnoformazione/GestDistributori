package it.autonew.gestioneautolavaggio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.autonew.gestioneautolavaggio.model.Veicolo;
import it.autonew.gestioneautolavaggio.service.GenericService;



@Controller
public class HomeController {

	@Autowired// spirng controlla nelle classi vede che c'è generic service e lo istanzia
	private GenericService service;
	
	@PostMapping(value="/inserimento")
		public String insertveicolo(@ModelAttribute Veicolo v) {
		this.service.insertveicolo(v);
		return "result";
		
	}
	
}
