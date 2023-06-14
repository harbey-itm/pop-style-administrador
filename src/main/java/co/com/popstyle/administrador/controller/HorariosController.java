package co.com.popstyle.administrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.popstyle.administrador.entity.HorarioBarberoEntity;
import co.com.popstyle.administrador.entity.HorarioEntity;
import co.com.popstyle.administrador.service.IHorariosBarberosService;

@RestController
public class HorariosController {

	@Autowired
	private IHorariosBarberosService horarioBarberoServicio;
	
	@GetMapping(value = "/consultarHorarios")
	// public RespuestaObjetosJson<T> consultarHorariosBarbero() {
	public List<HorarioEntity> consultarHorarios() {

		

		List<HorarioEntity> listaHorarioBarberoEntity = horarioBarberoServicio.consultarHorarios();

		return listaHorarioBarberoEntity;
	}

	@GetMapping(value = "/consultarHorariosBarbero")
	// public RespuestaObjetosJson<T> consultarHorariosBarbero() {
	public List<HorarioBarberoEntity> consultarHorariosBarbero() {

		List<HorarioBarberoEntity> listaHorarioBarberoEntity = horarioBarberoServicio.consultarHorariosBarberos();

		return listaHorarioBarberoEntity;
		
	
		/*
		 * if (listaHorarioBarberoEntity != null) { return new
		 * RespuestaObjetosJson<T>(new RespuestaDto(), (List<T>)
		 * listaHorarioBarberoEntity); } return new RespuestaObjetosJson<T>( new
		 * RespuestaDto(false,
		 * "No existen Datos de Horarios asignados a Barberos en la Base de Datos",
		 * "N/A"), null);
		 */

	}

}
