package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Pedido;
import com.example.demo.repositories.PedidoRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

/*
 * Classe que faz a consulta no repositorio
 * */
@Service
public class PedidoService {
	@Autowired //dependencia vai ser automaticamente instanciada pelo spring
	private	PedidoRepository repo;
	public Pedido buscar(int id) {
		Optional<Pedido> opt= repo.findById(id);
		if(opt.orElse(null) == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado id: "+id+ ", tipo: "+ Pedido.class.getName());
		}else
			return opt.get();
	}
}
