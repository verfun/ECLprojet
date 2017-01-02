package com.ECL.Domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Depart implements Serializable {
	

	private static final long serialVersionUID = 1192242245845376753L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departId;
	private Date date;
	private float duree;
	private Integer nbrTotalPlaces;
	private Float prix;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="volId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Vol vol;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="departId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Collection<Pilote> pilotes;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="departId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Collection<EmployeeNav> EmployeNav;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="departId")
	private Collection<Billet> billets;
	public Long getId() {
		return departId;
	}
	public void setId(Long id) {
		this.departId = id;
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
	public Collection<Pilote> getPilotes() {
		return pilotes;
	}
	public void setPilotes(Collection<Pilote> pilotes) {
		this.pilotes = pilotes;
	}
	public Collection<EmployeeNav> getEmployeNav() {
		return EmployeNav;
	}
	public void setEmployeNav(Collection<EmployeeNav> employeNav) {
		EmployeNav = employeNav;
	}
	public Integer getNbrTotalPlaces() {
		return nbrTotalPlaces;
	}
	public void setNbrTotalPlaces(Integer nbrTotalPlaces) {
		this.nbrTotalPlaces = nbrTotalPlaces;
	}
	public Collection<Billet> getBillets() {
		return billets;
	}
	public void setBillets(Collection<Billet> billets) {
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
