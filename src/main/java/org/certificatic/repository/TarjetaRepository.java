package org.certificatic.repository;

import java.util.List;

import org.certificatic.model.Tarjeta;

public interface TarjetaRepository {
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
