package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

/*
 * Classe que faz a consulta no repositorio
 * */
@Service
public class ClienteService {
	@Autowired //dependencia vai ser automaticamente instanciada pelo spring
	private	ClienteRepository repo;
	public Cliente buscar(int id) {
		Optional<Cliente> opt= repo.findById(id);
		if(opt.orElse(null) == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado id: "+id+ ", tipo: "+ Cliente.class.getName());
		}else
			return opt.get();
	}
}
