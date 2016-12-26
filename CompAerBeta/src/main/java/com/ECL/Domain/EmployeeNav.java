package com.ECL.Domain;

import javax.persistence.Entity;

@Entity
public class EmployeeNav extends Employee {

	private static final long serialVersionUID = -5492078835056071845L;
	
	private String fonction ;
	private int heuresVol;
	
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
