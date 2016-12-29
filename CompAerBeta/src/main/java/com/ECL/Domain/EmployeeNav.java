package com.ECL.Domain;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="employeeNav")  
public class EmployeeNav extends Employee {

	private static final long serialVersionUID = -5492078835056071845L;
	
	private String fonction ;
	private int heuresVol;
	
	public EmployeeNav(String nom, String prenom, Date db, String numSecSoc, String fonction, int heuresVol) {
		super(nom, prenom, db, numSecSoc);
		this.fonction = fonction;
		this.heuresVol = heuresVol;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public int getHeuresVol() {
		return heuresVol;
	}
	public void setHeuresVol(int heuresVol) {
		this.heuresVol = heuresVol;
	}
	
}
