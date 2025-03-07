package com.api.estoque.trabalho.estoque.repository;

import com.api.estoque.trabalho.estoque.model.produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<produto, Integer> {
}
