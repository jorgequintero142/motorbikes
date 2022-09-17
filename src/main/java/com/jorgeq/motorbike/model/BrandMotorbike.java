package com.jorgeq.motorbike.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrandMotorbike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idBrandMotorbike;
	private String nameBrandMotorbike;

	public BrandMotorbike(Integer idBrandMotorbike, String nameBrandMotorbike) {
		this.idBrandMotorbike = idBrandMotorbike;
		this.nameBrandMotorbike = nameBrandMotorbike;
	}

	public BrandMotorbike() {

	}

	public BrandMotorbike(String nameBrandMotorbike) {
		this.nameBrandMotorbike = nameBrandMotorbike;
	}

	public Integer getIdBrandMotorbike() {
		return idBrandMotorbike;
	}

	public void setIdBrandMotorbike(Integer idBrandMotorbike) {
		this.idBrandMotorbike = idBrandMotorbike;
	}

	public String getNameBrandMotorbike() {
		return nameBrandMotorbike;
	}

	public void setNameBrandMotorbike(String nameBrandMotorbike) {
		this.nameBrandMotorbike = nameBrandMotorbike;
	}
}