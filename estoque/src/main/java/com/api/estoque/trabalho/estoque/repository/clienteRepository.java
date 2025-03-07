package com.api.estoque.trabalho.estoque.repository;

import com.api.estoque.trabalho.estoque.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Integer> {
}
