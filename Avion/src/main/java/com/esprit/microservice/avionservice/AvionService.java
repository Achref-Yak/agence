package com.esprit.microservice.avionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionService {

	@Autowired
	private AvionRepository avionRepository;

	public Avion addAvion(Avion avion) {
		return avionRepository.save(avion);
	}
	public Avion updateAvion(int id, Avion newAvion) {
		if (avionRepository.findById(id).isPresent()) {
			Avion existingAvion = avionRepository.findById(id).get();
			existingAvion.setType(newAvion.getType());
			existingAvion.setCapacite(newAvion.getCapacite());
			existingAvion.setContructeur(newAvion.getContructeur());

			return avionRepository.save(existingAvion);
		} else
			return null;
	}
	public String deleteAvion(int id) {
		if (avionRepository.findById(id).isPresent()) {
			avionRepository.deleteById(id);
			return "avion supprimé";
		} else
			return "avion non supprimé";
	}
}
