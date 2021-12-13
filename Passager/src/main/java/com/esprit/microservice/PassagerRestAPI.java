package com.esprit.microservice;


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
@RequestMapping(value = "/api/candidats")
public class PassagerRestAPI {
	private String title = "Hello, I'm the passager Microservice";
	@Autowired
	private PassagerService passagerServices;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Passager> createPassagers(@RequestBody Passager candidat) {
		return new ResponseEntity<>(passagerServices.addPassager(candidat), HttpStatus.OK);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<List<Passager>> getPassagers(@RequestBody Passager candidat) {
		return new ResponseEntity<>(passagerServices.getPassagers(), HttpStatus.OK);
	}
	
	 
	 
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Passager> updatePassager(@PathVariable(value = "id") int id,
    										@RequestBody Passager candidat){
		return new ResponseEntity<>(passagerServices.updatePassager(id, candidat), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deletePassager(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(passagerServices.deletePassager(id), HttpStatus.OK);
	}
}
