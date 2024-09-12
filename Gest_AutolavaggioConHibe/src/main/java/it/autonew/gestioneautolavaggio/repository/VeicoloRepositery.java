package it.autonew.gestioneautolavaggio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.autonew.gestioneautolavaggio.model.Veicolo;

@Repository
public interface VeicoloRepositery extends JpaRepository<Veicolo,String>  {
	
	
	

}
