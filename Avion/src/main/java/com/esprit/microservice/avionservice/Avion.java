package com.esprit.microservice.avionservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avion implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id ;
	private int  capacite;
	private String type,contructeur;
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getContructeur() {
		return contructeur;
	}
	public void setContructeur(String contructeur) {
		this.contructeur = contructeur;
	}
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avion(String type,int capacite, String contructeur) {
		super();
		this.type = type;
		this.capacite = capacite;
		this.contructeur = contructeur;
	}
	
}
