package co.com.popstyle.administrador.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import co.com.popstyle.administrador.entity.HorarioBarberoEntity;
import co.com.popstyle.administrador.entity.HorarioEntity;

public interface IHorariosBarberosService {

	String registrarHoariosBarberosService(MultipartFile file);

	List<HorarioBarberoEntity> consultarHorariosBarberos();
	List<HorarioEntity> consultarHorarios();

}
