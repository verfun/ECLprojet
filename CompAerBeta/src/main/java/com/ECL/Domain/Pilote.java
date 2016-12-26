package com.ECL.Domain;

import javax.persistence.Entity;

@Entity
public class Pilote extends EmployeeNav{

	private static final long serialVersionUID = 4334515430494635646L;
	
	private Licence licence;

	public Licence getLicence() {
		return licence;
	}

	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	
}
