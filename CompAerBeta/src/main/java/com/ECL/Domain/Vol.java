package com.ECL.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vol implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Aeroport aeroportDest;
	private Aeroport aeroportOrig;
	private Appareil appareil;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Aeroport getAeroportDest() {
		return aeroportDest;
	}
	public void setAeroportDest(Aeroport aeroportDest) {
		this.aeroportDest = aeroportDest;
	}
	public Aeroport getAeroportOrig() {
		return aeroportOrig;
	}
	public void setAeroportOrig(Aeroport aeroportOrig) {
		this.aeroportOrig = aeroportOrig;
	}
	public Appareil getAppareil() {
		return appareil;
	}
	public void setAppareil(Appareil appareil) {
		this.appareil = appareil;
	}
	
	
	

}
