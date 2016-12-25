package com.ECL.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarteCredit implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String numero;
	
	
	public CarteCredit(String numero) {
		super();
		this.numero = numero;
	}
	public CarteCredit() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
