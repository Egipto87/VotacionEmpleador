package com.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.modelo.Rol;

public interface IRolRepo extends JpaRepository<Rol, Integer>{

}
