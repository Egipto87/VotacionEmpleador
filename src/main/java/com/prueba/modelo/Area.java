package com.prueba.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Area {
	
	@Id
	private int idArea;
	
	@Column(name="nomArea", length=100)
	private String nomArea;
	
	public int getIdArea() {
		return idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public String getNomArea() {
		return nomArea;
	}
	public void setNomArea(String nomArea) {
		this.nomArea = nomArea;
	}
	
}
