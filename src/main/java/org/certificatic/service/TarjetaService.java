package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.model.Tarjeta;

@WebService
public interface TarjetaService {
	
	/**
	 * M�todo para crear una tarjeta nueva
	 * @param tarjeta
	 * @return
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * M�todo para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();

}
