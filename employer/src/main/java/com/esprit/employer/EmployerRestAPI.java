package com.esprit.employer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employers")
public class EmployerRestAPI {
	private String title = "Hello, I'm the Employer Microservice";
	@Autowired
	private EmployerService employerServices;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Employer> createEmployers(@RequestBody Employer employer) {
		return new ResponseEntity<>(employerServices.addEmployer(employer), HttpStatus.OK);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<List<Employer>> getEmployers(@RequestBody Employer employer) {
		return new ResponseEntity<>(employerServices.getEmployers(), HttpStatus.OK);
	}
	
	 
	 
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Employer> updateEmployer(@PathVariable(value = "id") int id,
    										@RequestBody Employer employer){
		return new ResponseEntity<>(employerServices.updateEmployer(id, employer), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteEmployer(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(employerServices.deleteEmployer(id), HttpStatus.OK);
	}
}
