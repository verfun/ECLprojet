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

@Entity
public class Billet implements Serializable {
	

	private static final long serialVersionUID = -3958049354180961795L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer billetId;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="passagerId")
	private Passager passager;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="departId")
	private Depart depart;
	
	public Integer getId() {
		return billetId;
	}
	public void setId(Integer id) {
		this.billetId = id;
	}
	public Passager getPassager() {
		return passager;
	}
	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	public Depart getDepart() {
		return depart;
	}
	public void setDepart(Depart depart) {
		this.depart = depart;
	}
	
}
