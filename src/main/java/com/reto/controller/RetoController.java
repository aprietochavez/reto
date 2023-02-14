package com.reto.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reto.model.RequestBodyEntity;
import com.reto.model.ResponseBodyEntity;
import com.reto.model.TipoCambioEntity;
import com.reto.repository.ICrudRepository;
import com.reto.repository.IJpaRepository;

@RestController
@RequestMapping("/api/reto")
public class RetoController {
	
	@Autowired
	ICrudRepository crudRepository;
	
	@Autowired
	IJpaRepository jpaRepository;


	@PostMapping("aplicar-tipo-cambio")
	public ResponseEntity<?> aplicarTipoCambio(@Valid @RequestBody RequestBodyEntity requestDto) {
		ResponseBodyEntity responseDto = new ResponseBodyEntity();
		Double monto = requestDto.getMonto();
		responseDto.setMonto(monto);
		responseDto.setMonedaOrigen(requestDto.getMonedaOrigen());
		responseDto.setMonedaDestino(requestDto.getMonedaDestino());
		double dTipoDeCambio = crudRepository.max();
		responseDto.setTipoDeCambio(dTipoDeCambio);
		responseDto.setMontoConTipoDeCambio(monto * dTipoDeCambio);
		return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
	}
	
	@PostMapping("actualizar-tipo-cambio")
	public ResponseEntity<?> actualizarTipoCambio(@RequestParam("tipoDeCambio") Double tipoDeCambio) {
		TipoCambioEntity tipoCambio = new TipoCambioEntity();
		tipoCambio.setTipoCambio(tipoDeCambio);
		TipoCambioEntity nuevoTipoCambio = jpaRepository.save(tipoCambio);
		return new ResponseEntity<>(nuevoTipoCambio, HttpStatus.OK);	
	}

}