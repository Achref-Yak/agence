package com.esprit.vol;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class vol implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id ;
	
	private String depart,destination,dateVol;
	public int getId() {
		return id;
	}
	public String getdepart() {
		return depart;
	}
	public void setdepart(String depart) {
		this.depart = depart;
	}
	
	
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination = destination;
	}

	public String getdateVol() {
		return dateVol;
	}
	public void setdateVol(String dateVol) {
		this.dateVol = dateVol;
	}

	
	public vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public vol(String depart,String destination, String dateVol) {
		super();
		this.depart = depart;
		
	}
	
}