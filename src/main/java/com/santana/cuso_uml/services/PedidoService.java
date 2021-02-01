package com.santana.cuso_uml.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santana.cuso_uml.domain.Pedido;
import com.santana.cuso_uml.repositories.PedidoRepository;
import com.santana.cuso_uml.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido findById(Integer id){
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + "Tipo: " + 
		Pedido.class.getName()));
	}
	
}
