package com.prueba.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity	
public class Usuario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsuario;
	
	@Column(name="nombre", length=100)
	private String nombre;
	
	@Column(name="usuario", length=40)
	private String usuario;
	
	@Column(name="clave", length=100)
	private String clave;

	@Column(name="tipo", length=50)
	private String tipo;
	
	@ManyToMany
	@JoinTable(name="usuarios_roles", joinColumns=@JoinColumn(name="usuario_id")
		,inverseJoinColumns=@JoinColumn(name="rol_id")
	)
	private Set<Rol> roles;
	
	@ManyToMany
	@JoinTable(name="usuarios_votos", joinColumns=@JoinColumn(name="usuario_id")
		,inverseJoinColumns=@JoinColumn(name="voto_id")
	)
	private Set<Voto> votos;
	
	@JoinColumn(name="area_id",unique=true)
	@OneToOne(cascade=CascadeType.ALL) 
	private Area area;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String usuario, String nombre, Set<Rol> roles) {
		super();
		this.idUsuario=id;
		this.usuario=usuario;
		this.nombre=nombre;
		this.roles=roles;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public Set<Voto> getVotos() {
		return votos;
	}

	public void setVotos(Set<Voto> votos) {
		this.votos = votos;
	}

	public Area getArea() {
		return area;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
