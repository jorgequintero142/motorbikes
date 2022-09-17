package com.jorgeq.motorbike.model;

public class MotorBike {
	
	
	public MotorBike(Long idMotorBike, String uiMotorBike, Integer idBrandMotorbike, Integer idTypeMotorBike) {
		super();
		this.idMotorBike = idMotorBike;
		this.uiMotorBike = uiMotorBike;
		this.idBrandMotorbike = idBrandMotorbike;
		this.idTypeMotorBike = idTypeMotorBike;
	}

	private Long idMotorBike;
	private String uiMotorBike;
	private Integer idBrandMotorbike;
	private Integer idTypeMotorBike;

	public Long getIdMotorBike() {
		return idMotorBike;
	}

	public void setIdMotorBike(Long idMotorBike) {
		this.idMotorBike = idMotorBike;
	}

	public String getUiMotorBike() {
		return uiMotorBike;
	}

	public void setUiMotorBike(String uiMotorBike) {
		this.uiMotorBike = uiMotorBike;
	}

	public Integer getIdBrandMotorbike() {
		return idBrandMotorbike;
	}

	public void setIdBrandMotorbike(Integer idBrandMotorbike) {
		this.idBrandMotorbike = idBrandMotorbike;
	}

	public Integer getIdTypeMotorBike() {
		return idTypeMotorBike;
	}

	public void setIdTypeMotorBike(Integer idTypeMotorBike) {
		this.idTypeMotorBike = idTypeMotorBike;
	}

}
