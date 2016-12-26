package com.ECL.Domain;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appareil implements Serializable{
	
	
	private static final long serialVersionUID = 2678224974090028925L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String NumImmatriculation;
	private TypeAppareil typeAppareil;
	
	private ArrayList<Vol> vol;

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

	public ArrayList<Vol> getVol() {
		return vol;
	}

	public void setVol(ArrayList<Vol> vol) {
		this.vol = vol;
	}

	
	
	

}
