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
public class Appareil implements Serializable{
	
	private static final long serialVersionUID = 2678224974090028925L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long appareilId;
	private String NumImmatriculation;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="typeAppareilId")
	private TypeAppareil typeAppareil;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Collection<Vol> vol;

	public Long getId() {
		return appareilId;
	}

	public void setId(Long id) {
		this.appareilId = id;
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

	public Collection<Vol> getVol() {
		return vol;
	}

	public void setVol(ArrayList<Vol> vol) {
		this.vol = vol;
	}

}
