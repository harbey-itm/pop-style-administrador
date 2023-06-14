package co.com.popstyle.administrador.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.com.popstyle.administrador.entity.HorarioBarberoEntity;
import co.com.popstyle.administrador.entity.HorarioEntity;
import co.com.popstyle.administrador.repository.IHorarioBarberoRepository;
import co.com.popstyle.administrador.repository.IHorarioRepository;
import co.com.popstyle.administrador.service.IHorariosBarberosService;

@Service
public class ServiceHorariosBarberosImpl implements IHorariosBarberosService {

	@Autowired
	private IHorarioBarberoRepository horarioBarberoRepository;

	@Autowired
	private IHorarioRepository horarioRepository;
	
	
	
	@Override
	public String registrarHoariosBarberosService(MultipartFile multipartfiles) {

		return"";
	}

	@Override
	public List<HorarioBarberoEntity> consultarHorariosBarberos() {
		
		return horarioBarberoRepository.findAll();
		
	}

	@Override
	public List<HorarioEntity> consultarHorarios() {
		return horarioRepository.findAll();
	}
}