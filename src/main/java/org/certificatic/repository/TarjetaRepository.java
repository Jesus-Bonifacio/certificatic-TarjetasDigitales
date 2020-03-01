package org.certificatic.repository;

import java.util.List;

import org.certificatic.model.Tarjeta;

public interface TarjetaRepository {
	/**
	 * Método para crear una tarjeta nueva
	 * @param tarjeta
	 * @return
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Método para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();
	
}
