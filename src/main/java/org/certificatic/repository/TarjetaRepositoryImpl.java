package org.certificatic.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository{
	
	public static List<Tarjeta> tarjetasDigitales = new ArrayList<>();

	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Creando tarjeta");
		tarjetasDigitales.add(tarjeta);
		return null;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println("Obteniendo Tarjetas Digitales");
		return tarjetasDigitales;
	}

}
