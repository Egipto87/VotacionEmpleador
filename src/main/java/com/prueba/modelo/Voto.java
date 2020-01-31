package com.prueba.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voto {
	
	@Id
	private int idVoto;
	
	@Column(name="fecha", length=20)
	private String fecha;
	
	@Column(name="comentario", length=150)
	private String comentario;
	
	public int getIdVoto() {
		return idVoto;
	}
	public void setIdVoto(int idVoto) {
		this.idVoto = idVoto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}	
	
}
