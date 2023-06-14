package co.com.popstyle.administrador.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "horarios")
public class HorarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHorario;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "hora")
	private String hora;
	
	@Column(name = "estadofecha")
	private boolean estadoFecha;

	@ManyToOne(fetch = FetchType.LAZY)
	private  BarberoEntity barbero;
	
	@OneToMany(mappedBy = "horario")
	Set<HorarioBarberoEntity> hariosbarberos;

}
