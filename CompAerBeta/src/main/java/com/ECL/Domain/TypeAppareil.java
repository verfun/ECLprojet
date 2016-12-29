package com.ECL.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeAppareil {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long typeAppareilId;
	private String typeName;
	public Long getId() {
		return typeAppareilId;
	}
	public void setId(Long id) {
		this.typeAppareilId = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
