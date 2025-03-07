package com.api.estoque.trabalho.estoque.repository;

import com.api.estoque.trabalho.estoque.model.vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vendasRepository extends JpaRepository<vendas, Integer> {
}
