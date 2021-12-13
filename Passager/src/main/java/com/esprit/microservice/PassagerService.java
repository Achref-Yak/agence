package com.esprit.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassagerService {

	@Autowired
	private PassagerRepository passagerRepository;

	public Passager addPassager(Passager candidat) {
		return passagerRepository.save(candidat);
	}
	
	public List<Passager> getPassagers() {
		return passagerRepository.findAll();
	}
	
	public Passager getOnePassager(int id) {
		return passagerRepository.getById(id);
	}
	
	public Passager updatePassager(int id, Passager newCandidat) {
		if (passagerRepository.findById(id).isPresent()) {
			Passager existingCandidat = passagerRepository.findById(id).get();
			existingCandidat.setNom(newCandidat.getNom());
			existingCandidat.setPrenom(newCandidat.getPrenom());
			existingCandidat.setEmail(newCandidat.getEmail());

			return passagerRepository.save(existingCandidat);
		} else
			return null;
	}
	public String deletePassager(int id) {
		if (passagerRepository.findById(id).isPresent()) {
			passagerRepository.deleteById(id);
			return "candidat supprimé";
		} else
			return "candidat non supprimé";
	}
}
