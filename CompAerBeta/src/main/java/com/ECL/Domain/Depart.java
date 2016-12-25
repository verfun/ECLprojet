package com.ECL.Domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Depart implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date;
	private float duree;
	
	
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
	
	

}
