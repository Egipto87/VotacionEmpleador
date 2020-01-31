package com.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.modelo.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
}
