package com.microserves.pilote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiloteService {

	@Autowired
	private PiloteRepository piloteRepository;

	public Pilote addPilote(Pilote pilote) {
		return piloteRepository.save(pilote);
	}
	
	public List<Pilote> getPilote() {
		return piloteRepository.findAll();
	}
	
	public Pilote getOnePilote(int id) {
		return piloteRepository.getById(id);
	}
	
	public Pilote updatePilote(int id, Pilote pilote) {
		if (piloteRepository.findById(id).isPresent()) {
			Pilote existingPilote = piloteRepository.findById(id).get();
			existingPilote.setNom(pilote.getNom());
			existingPilote.setPrenom(pilote.getPrenom());
		 
			return piloteRepository.save(existingPilote);
		} else
			return null;
	}
	public String deletePilote(int id) {
		if (piloteRepository.findById(id).isPresent()) {
			piloteRepository.deleteById(id);
			return "employer supprimé";
		} else
			return "employer non supprimé";
	}
}