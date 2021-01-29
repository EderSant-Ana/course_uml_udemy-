package com.santana.cuso_uml.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

//	@GetMapping
//	public ResponseEntity<List<String>> listar(){
//		List<String> list = new ArrayList<>();
//		
//		list.add("Eletrônicos");
//		list.add("Games");
//		list.add("Escritório");
//		
//		return ResponseEntity.ok().body(list);
//		
//	}
	
	@GetMapping
	public String listar() {
		return "Rest está funcionando!";
	}
}
