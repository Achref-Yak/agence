package com.microserves.pilote;

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
@RequestMapping(value = "/api/pilotes")
public class PiloteRestAPI {
	private String title = "Hello, I'm the Pilote Microservice";
	@Autowired
	private PiloteService piloteServices;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Pilote> createPilote (@RequestBody Pilote pilote) {
		return new ResponseEntity<>(piloteServices.addPilote(pilote), HttpStatus.OK);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<List<Pilote>> getPilote(@RequestBody Pilote pilote) {
		return new ResponseEntity<>(piloteServices.getPilote(), HttpStatus.OK);
	}
	
	 
	 
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Pilote> updatePilote(@PathVariable(value = "id") int id,
    										@RequestBody Pilote pilote){
		return new ResponseEntity<>(piloteServices.updatePilote(id, pilote), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deletePilote(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(piloteServices.deletePilote(id), HttpStatus.OK);
	}
}
