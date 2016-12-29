package com.ECL.Domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="role",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")  
public class Employee implements Serializable {
	
	private static final long serialVersionUID = -4754800251263536932L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeId;
	private String nom;
	private String prenom;
	private Date db;
	private String numSecSoc;
	
	public Employee(String nom, String prenom, Date db, String numSecSoc) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.db = db;
		this.numSecSoc = numSecSoc;
	}
	public Long getId() {
		return employeeId;
	}
	public void setId(Long id) {
		this.employeeId = id;
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
