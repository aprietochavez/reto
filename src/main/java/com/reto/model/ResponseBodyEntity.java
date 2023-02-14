package com.reto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBodyEntity {
	private Double monto;
	private Double montoConTipoDeCambio;
	private String monedaOrigen;
	private String monedaDestino;
	private Double tipoDeCambio;
}