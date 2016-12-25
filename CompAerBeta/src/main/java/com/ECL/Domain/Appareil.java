package com.ECL.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Appareil implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String NumImmatriculation;
	private TypeAppareil typeAppareil;
	
	private Vol vol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumImmatriculation() {
		return NumImmatriculation;
	}

	public void setNumImmatriculation(String numImmatriculation) {
		NumImmatriculation = numImmatriculation;
	}

	public TypeAppareil getTypeAppareil() {
		return typeAppareil;
	}

	public void setTypeAppareil(TypeAppareil typeAppareil) {
		this.typeAppareil = typeAppareil;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	

}
