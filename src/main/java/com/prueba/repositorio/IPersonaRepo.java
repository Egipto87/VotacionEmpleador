package com.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.modelo.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
