package com.talan.gto.demandeserver.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.talan.gto.demandeserver.model.Demande;

@Repository
public interface DemandeRepository  extends JpaRepository<Demande, Long>{
	List<Demande> findByIdClient(Long idClient);
}