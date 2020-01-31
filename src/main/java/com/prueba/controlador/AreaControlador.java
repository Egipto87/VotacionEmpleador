package com.prueba.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.modelo.Area;
import com.prueba.modelo.Voto;
import com.prueba.repositorio.IAreaRepo;
import com.prueba.repositorio.IVotoRepo;

public class AreaControlador {

	@Autowired
	IAreaRepo arearepo;
	
	@GetMapping("/votar")
	public String votacion(@RequestParam(name="name", required=false, defaultValue="Wolrd") String name, Model model) {
		
		Area area = new Area();
		area.setIdArea(1);
		area.setNomArea("Tecnología");
		arearepo.save(area);
		model.addAttribute("name", name);
		return "votar";
	}
}
