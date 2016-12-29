package com.ECL.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Passager implements Serializable {
	
	
	private static final long serialVersionUID = 4077049059649819852L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long passagerId;
	private String nom;
	private String prenom;
	private int age;
	private String email;
	private String passwd;
	@OneToOne
	private CarteCredit carteCredit;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="passagerId")
	private Collection<Billet> billet;
	
	public Long getId() {
		return passagerId;
	}
	public void setId(Long id) {
		this.passagerId = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CarteCredit getCarteCredit() {
		return carteCredit;
	}
	public void setCarteCredit(CarteCredit carteCredit) {
		this.carteCredit = carteCredit;
	}
	public Collection<Billet> getBillet() {
		return billet;
	}
	public void setBillet(Collection<Billet> billet) {
		this.billet = billet;
	}
	
	
	

}
