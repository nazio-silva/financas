package com.tagworking.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tagworking.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
