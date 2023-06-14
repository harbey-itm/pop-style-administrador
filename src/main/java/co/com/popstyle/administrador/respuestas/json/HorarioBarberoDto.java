package co.com.popstyle.administrador.respuestas.json;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Data
public class HorarioBarberoDto {

		private int idHorarioBarbero;

		private HorarioRespuestaDto horario;

		private BarberoRespuestaDto barbero;
		
		private boolean estado;
	
}
