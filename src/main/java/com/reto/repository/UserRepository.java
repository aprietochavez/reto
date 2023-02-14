package com.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reto.model.UsuarioEntity;

public interface UserRepository extends JpaRepository<UsuarioEntity, Long> {
}
