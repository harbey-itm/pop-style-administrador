package co.com.popstyle.administrador.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="horarios_barberos")
public class HorarioBarberoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHorarioBarbero;
	
	@ManyToOne
	@JoinColumn(name = "horario_id")
	private HorarioEntity horario;

	@ManyToOne
	@JoinColumn(name = "barbero_id")
	private BarberoEntity barbero;
	
	private boolean estado;

}
