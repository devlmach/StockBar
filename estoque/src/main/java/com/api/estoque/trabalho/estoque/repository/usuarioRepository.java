package com.api.estoque.trabalho.estoque.repository;

import com.api.estoque.trabalho.estoque.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Integer> {

    UserDetails findByLogin(String login);
}
