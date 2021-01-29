package com.santana.cuso_uml.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.cuso_uml.domain.Estado;
import com.santana.cuso_uml.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;

	
	@GetMapping
	public ResponseEntity<List<Estado>> listar(){
		List<Estado> list = estadoService.listar();
		return ResponseEntity.ok().body(list);
	}
	

}
