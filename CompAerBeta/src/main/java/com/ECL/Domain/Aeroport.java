package com.ECL.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aeroport implements Serializable{
	
	
	private static final long serialVersionUID = 5383291231951611983L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long aeroportId;
	private String name;
	private String code;
	private String ville;
	
	public Aeroport() {
		super();
	}

	public Aeroport(String name, String code,String ville) {
		super();
		this.name = name;
		this.code = code;
		this.ville = ville;
	}

	public Long getId() {
		return aeroportId;
	}

	public void setId(Long id) {
		this.aeroportId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
