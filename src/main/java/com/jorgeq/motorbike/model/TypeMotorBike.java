package com.jorgeq.motorbike.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeMotorBike {
	
	public TypeMotorBike() {
		
	}
	public TypeMotorBike(Integer idTypeMotorBike, String nameTypeMotorBike) {
		super();
		this.idTypeMotorBike = idTypeMotorBike;
		this.nameTypeMotorBike = nameTypeMotorBike;
	}
	public TypeMotorBike(String nameTypeMotorBike) {
		super();
		//this.idTypeMotorBike = idTypeMotorBike;
		this.nameTypeMotorBike = nameTypeMotorBike;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTypeMotorBike;
	private String nameTypeMotorBike;

	public Integer getIdTypeMotorBike() {
		return idTypeMotorBike;
	}

	public void setIdTypeMotorBike(Integer idTypeMotorBike) {
		this.idTypeMotorBike = idTypeMotorBike;
	}

	public String getNameTypeMotorBike() {
		return nameTypeMotorBike;
	}

	public void setNameTypeMotorBike(String nameTypeMotorBike) {
		this.nameTypeMotorBike = nameTypeMotorBike;
	}
}
