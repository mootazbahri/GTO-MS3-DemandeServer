package com.talan.gto.demandeserver.service;

import java.util.List;
import java.util.Optional;

import com.talan.gto.demandeserver.model.Demande;


public interface DemandeService {
	
	List<Demande> findAll();
	
	List<Demande> findByIdClient(Long idClient);
	
	Optional<Demande> findById(Long id);
	
	void save(Demande liste);

	void deleteById(Long id);
	
}
