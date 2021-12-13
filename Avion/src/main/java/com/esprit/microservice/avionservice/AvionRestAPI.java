package com.esprit.microservice.avionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/avions")
public class AvionRestAPI {
	private String title = "Hello, I'm the avion Microservice";
	@Autowired
	private AvionService avionService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Avion> createAvion(@RequestBody Avion avion) {
		return new ResponseEntity<>(avionService.addAvion(avion), HttpStatus.OK);
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Avion> updateAvion(@PathVariable(value = "id") int id,
												@RequestBody Avion avion){
		return new ResponseEntity<>(avionService.updateAvion(id, avion), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteAvion(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(avionService.deleteAvion(id), HttpStatus.OK);
	}
}
