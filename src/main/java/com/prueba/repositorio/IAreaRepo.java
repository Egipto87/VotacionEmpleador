package com.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.modelo.Area;

public interface IAreaRepo extends JpaRepository<Area, Integer>{
	
}
