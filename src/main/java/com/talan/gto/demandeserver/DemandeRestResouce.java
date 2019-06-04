package com.talan.gto.demandeserver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talan.gto.demandeserver.model.Demande;
import com.talan.gto.demandeserver.service.DemandeService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Demande")
public class DemandeRestResouce {
	
	@Autowired
	private DemandeService demandeService;
	
	@GetMapping("/getAll")
	List<Demande> getAll() {
		return demandeService.findAll();
	}
	@GetMapping("/getDemande/{demandeId}")
	Optional<Demande> getDemande(@PathVariable Long demandeId) {
		return demandeService.findById(demandeId);
	}
	@GetMapping("/getDemandes/{idClient}")
	List<Demande> getDemandes(@PathVariable Long idClient) {
		return demandeService.findByIdClient(idClient);
	}
	@PostMapping(value="/addDemande")
    public List<Demande> addDemande(@RequestBody Demande liste) {
		demandeService.save(liste);
		return demandeService.findAll();
    }
	
	@PostMapping(value="/deleteDemande/{demandeId}")
	public List<Demande> deleteDemande(@PathVariable Long demandeId) {
		demandeService.deleteById(demandeId);
		return demandeService.findAll();
	}
	
	@PutMapping(value="/updateDemande/{demandeId}")
    public List<Demande> updateDemande(@PathVariable Long demandeId, @RequestBody Demande demande) {
		demande.setId(demandeId);
		demandeService.save(demande);
		return demandeService.findAll();
    }
}
