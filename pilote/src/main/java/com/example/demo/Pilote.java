package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pilote implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	@Id
	@GeneratedValue
	private int id;
	private String nom, prenom;
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Pilote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pilote(String nom) {
		super();
		this.nom = nom;
	}
	
}



