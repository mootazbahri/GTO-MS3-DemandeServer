package com.talan.gto.demandeserver.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talan.gto.demandeserver.model.Demande;
import com.talan.gto.demandeserver.repository.DemandeRepository;
import com.talan.gto.demandeserver.service.DemandeService;

@Service
public class DemadeServiceImpl implements DemandeService{

	@Autowired
	private DemandeRepository demandeRepository;
	
	@Override
	public List<Demande> findAll() {
		return demandeRepository.findAll();
	}

	@Override
	public List<Demande> findByIdClient(Long idClient) {
		return demandeRepository.findByIdClient(idClient);
	}
	
	@Override
	public Optional<Demande> findById(Long id) {
		return demandeRepository.findById(id);
	}

	@Override
	public void save(Demande liste) {
		demandeRepository.save(liste);
	}

	@Override
	public void deleteById(Long id) {
		demandeRepository.deleteById(id);
	}
	
	
}
