package co.com.popstyle.administrador.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "barberos")
public class BarberoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer barberoId;

	@Column(name = "nombres")
	private String nombresApellidos;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "estado")
	private String estado;	
	
	@Column(name="fechacreacion")
	private LocalDateTime fechaCreacion;

	@OneToMany(mappedBy = "barbero")
	Set<HorarioBarberoEntity> hariosbarberos;
}
