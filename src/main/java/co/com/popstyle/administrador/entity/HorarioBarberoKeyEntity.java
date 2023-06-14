package co.com.popstyle.administrador.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class HorarioBarberoKeyEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="horario_id")
	private Integer horarioId;
	
	@Column(name="barbero_id")
	private Integer barberoId;

}
