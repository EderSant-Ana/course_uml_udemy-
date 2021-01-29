package com.santana.cuso_uml.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.cuso_uml.domain.Categoria;
import com.santana.cuso_uml.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

//	@GetMapping
//	public String listar() {
//		return "Rest está funcionando!";
//	}

//	@GetMapping
//	public ResponseEntity<List<Categoria>> listar(){
//		Categoria cat1 = new Categoria(1, "Informática");
//		Categoria cat2 = new Categoria(2, "Escritório");
//		
//		List<Categoria> list = new ArrayList<>();
//		list.add(cat1);
//		list.add(cat2);
//		return ResponseEntity.ok().body(list);
//	}	
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> find(@PathVariable Integer id){		
		Categoria obj = categoriaService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar(){
		List<Categoria> list = categoriaService.listar();
		return ResponseEntity.ok().body(list);
	}
	

}
