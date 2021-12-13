package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiloteService {

	@Autowired
	private PiloteRepository piloteRepository;

	public Pilote addPilote(Pilote pilote) {
		return piloteRepository.save(pilote);
	}
	public Pilote updatePilote(int id, Pilote newPilote) {
		if (piloteRepository.findById(id).isPresent()) {
			Pilote existingPilote = piloteRepository.findById(id).get();
			existingPilote.setNom(newPilote.getNom());
			existingPilote.setPrenom(newPilote.getPrenom());

			return piloteRepository.save(existingPilote);
		} else
			return null;
	}
	public String deletePilote(int id) {
		if (piloteRepository.findById(id).isPresent()) {
			piloteRepository.deleteById(id);
			return "Pilote supprimé";
		} else
			return "Pilote non supprimé";
	}
}
