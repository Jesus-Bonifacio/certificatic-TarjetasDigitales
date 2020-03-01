package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.model.Tarjeta;
import org.certificatic.repository.TarjetaRepository;
import org.certificatic.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		tarjetaRepository.crearTarjeta(tarjeta);		
		return null;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}
	

}
