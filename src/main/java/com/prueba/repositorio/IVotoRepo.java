package com.prueba.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.modelo.Voto;

public interface IVotoRepo extends JpaRepository<Voto, Integer>{

}
