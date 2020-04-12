package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

/*
 * Classe que faz a consulta no repositorio
 * */
@Service
public class CategoriaService {
	@Autowired //dependencia vai ser automaticamente instanciada pelo spring
	private	CategoriaRepository repo;
	public Categoria buscar(int id) {
		Optional<Categoria> opt= repo.findById(id);
		if(opt.orElse(null) == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado id: "+id+ ", tipo: "+ Categoria.class.getName());
		}else
			return opt.get();
	}
}
