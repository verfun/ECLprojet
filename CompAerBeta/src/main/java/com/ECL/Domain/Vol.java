package com.ECL.Domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vol implements Serializable{
	
	
	private static final long serialVersionUID = 174533238934244473L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long volId;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="aeroportDest")
	private Aeroport aeroportDest;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="aeroportOrig")
	private Aeroport aeroportOrig;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="appareilId")
	private Appareil appareil;
	 
	
	public Long getId() {
		return volId;
	}
	public void setId(Long id) {
		this.volId = id;
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
