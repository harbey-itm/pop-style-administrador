package co.com.popstyle.administrador.respuestas.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class RespuestaDto {
	
	private Boolean ok;
	private String nombreError;
	private String codigoError;
	
	public RespuestaDto() {
		this.ok = true;
		this.nombreError= "";
		this.codigoError= "";
	}

}
