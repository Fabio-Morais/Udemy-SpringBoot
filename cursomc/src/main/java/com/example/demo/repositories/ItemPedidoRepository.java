package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ItemPedido;

/*
 * Objeto responsavel por salvar as categorias no banco de dados
 * */

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
