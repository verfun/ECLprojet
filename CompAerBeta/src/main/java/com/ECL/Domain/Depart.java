package com.ECL.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Depart implements Serializable {
	

	private static final long serialVersionUID = 1192242245845376753L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Vol vol;
	private Date date;
	private float duree;
	private Pilote[] pilotes;
	private EmployeeNav[] EmployeNav;
	private Integer nbrTotalPlaces;
	private ArrayList<Billet> billets;
	private Float prix;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Pilote[] getPilotes() {
		return pilotes;
	}
	public void setPilotes(Pilote[] pilotes) {
		this.pilotes = pilotes;
	}
	public EmployeeNav[] getEmployeNav() {
		return EmployeNav;
	}
	public void setEmployeNav(EmployeeNav[] employeNav) {
		EmployeNav = employeNav;
	}
	public Integer getNbrTotalPlaces() {
		return nbrTotalPlaces;
	}
	public void setNbrTotalPlaces(Integer nbrTotalPlaces) {
		this.nbrTotalPlaces = nbrTotalPlaces;
	}
	public ArrayList<Billet> getBillets() {
		return billets;
	}
	public void setBillets(ArrayList<Billet> billets) {
		this.billets = billets;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	

}
