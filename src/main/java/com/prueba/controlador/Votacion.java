package com.prueba.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.modelo.Persona;
import com.prueba.modelo.Voto;
import com.prueba.repositorio.IPersonaRepo;
import com.prueba.repositorio.IVotoRepo;


@Controller
public class Votacion {
	
	@Autowired
	private IPersonaRepo repo;
	
	@Autowired
	IVotoRepo votorepo;
	
	@GetMapping("/votar")
	public String votacion(@RequestParam(name="name", required=false, defaultValue="Satisfactorio") String name, Model model) {
		
		Voto voto = new Voto();
		voto.setIdVoto(3);
		voto.setFecha("06-01-2020");
		voto.setComentario("Todo bien");
		votorepo.save(voto);
		model.addAttribute("name", name);
		return "votar";
	}
	
	@GetMapping("/votos")
	public String votacion(Model model) {
		model.addAttribute("votos",votorepo.findAll());
		return "resultado";
	}
	
}

