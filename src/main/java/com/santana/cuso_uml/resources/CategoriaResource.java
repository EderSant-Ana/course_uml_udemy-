package com.santana.cuso_uml.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.cuso_uml.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

//	@GetMapping
//	public String listar() {
//		return "Rest está funcionando!";
//	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar(){
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		return ResponseEntity.ok().body(list);
	}
}
