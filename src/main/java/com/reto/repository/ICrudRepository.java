package com.reto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.reto.model.TipoCambioEntity;

public interface ICrudRepository extends CrudRepository<TipoCambioEntity, Long> {
	
	@Query(value = "SELECT MAX(tipoCambio) FROM TipoCambioEntity")
	public Double max();

}