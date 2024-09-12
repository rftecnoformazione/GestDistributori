package it.autonew.gestioneautolavaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.autonew.gestioneautolavaggio.model.Veicolo;
import it.autonew.gestioneautolavaggio.repository.VeicoloRepositery;

@Service
public class GenericService {

	@Autowired
	private VeicoloRepositery vrepo;
	
	
	
	public void insertveicolo(Veicolo v)
	{
		this.vrepo.save(v);
		
		
	}
}
