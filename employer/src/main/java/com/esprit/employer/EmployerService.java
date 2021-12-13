package com.esprit.employer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {

	@Autowired
	private EmployerRepository employerRepository;

	public Employer addEmployer(Employer employer) {
		return employerRepository.save(employer);
	}
	
	public List<Employer> getEmployers() {
		return employerRepository.findAll();
	}
	
	public Employer getOneEmployer(int id) {
		return employerRepository.getById(id);
	}
	
	public Employer updateEmployer(int id, Employer newEmployer) {
		if (employerRepository.findById(id).isPresent()) {
			Employer existingEmployer = employerRepository.findById(id).get();
			existingEmployer.setNom(newEmployer.getNom());
			existingEmployer.setPrenom(newEmployer.getPrenom());
			existingEmployer.setEmail(newEmployer.getEmail());

			return employerRepository.save(existingEmployer);
		} else
			return null;
	}
	public String deleteEmployer(int id) {
		if (employerRepository.findById(id).isPresent()) {
			employerRepository.deleteById(id);
			return "employer supprimé";
		} else
			return "employer non supprimé";
	}
}