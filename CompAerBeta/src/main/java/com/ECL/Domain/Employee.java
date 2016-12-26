package com.ECL.Domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	private static final long serialVersionUID = -4754800251263536932L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private Date db;
	private String numSecSoc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getDb() {
		return db;
	}
	public void setDb(Date db) {
		this.db = db;
	}
	public String getNumSecSoc() {
		return numSecSoc;
	}
	public void setNumSecSoc(String numSecSoc) {
		this.numSecSoc = numSecSoc;
	}
	
	

}
