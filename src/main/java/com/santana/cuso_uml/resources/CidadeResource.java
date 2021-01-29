package com.santana.cuso_uml.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.cuso_uml.domain.Cidade;
import com.santana.cuso_uml.services.CidadeService;

@RestController
@RequestMapping(value="/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeService cidadeService;

	
	@GetMapping
	public ResponseEntity<List<Cidade>> listar(){
		List<Cidade> list = cidadeService.listar();
		return ResponseEntity.ok().body(list);
	}
	

}
