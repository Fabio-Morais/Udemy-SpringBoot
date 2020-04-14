package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Pedido;

/*
 * Objeto responsavel por salvar as categorias no banco de dados
 * */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
