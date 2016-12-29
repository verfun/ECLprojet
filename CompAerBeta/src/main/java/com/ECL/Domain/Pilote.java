package com.ECL.Domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="pilote")  
public class Pilote extends EmployeeNav{

	private static final long serialVersionUID = 4334515430494635646L;
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Licence licence;

	
	public Pilote(String nom, String prenom, Date db, String numSecSoc, int heuresVol,
			Licence licence) {
		super(nom, prenom, db, numSecSoc, "Pilote", heuresVol);
		this.licence = licence;
	}

	public Licence getLicence() {
		return licence;
	}

	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	
}
