package com.santana.cuso_uml.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.cuso_uml.domain.Produto;
import com.santana.cuso_uml.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;

	
	@GetMapping
	public ResponseEntity<List<Produto>> listar(){
		List<Produto> list = produtoService.listar();
		return ResponseEntity.ok().body(list);
		
	}
	

}
