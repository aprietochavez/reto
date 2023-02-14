package com.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reto.model.TipoCambioEntity;

public interface IJpaRepository extends JpaRepository<TipoCambioEntity, Long> {
	

}