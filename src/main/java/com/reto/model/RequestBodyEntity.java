package com.reto.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBodyEntity {
	@NotNull(message = "El monto es obligatorio")
	private Double monto;
	@NotNull(message = "La moneda origen es obligatoria")
	private String monedaOrigen;
	@NotNull(message = "La moneda destino es obligatoria")
	private String monedaDestino;
}