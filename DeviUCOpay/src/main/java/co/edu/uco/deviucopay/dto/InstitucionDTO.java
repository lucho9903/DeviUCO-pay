package co.edu.uco.deviucopay.dto;
import java.util.UUID;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;


public class InstitucionDTO {
	
	private UUID id;
	private String nombre;
	
	
	public InstitucionDTO(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public InstitucionDTO () {
		super();
	}
	
	public static final InstitucionDTO build() {
		return new InstitucionDTO();
	}
	
	public final UUID getId() {
		return id;
	}
	public final InstitucionDTO setId( final UUID id) {
		this.id = id;
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final InstitucionDTO setNombre(final String nombre) {
		this.nombre=TextHelper.applyTrim(nombre);
		return this;
	}
	
	public static void main(String[] args) {
		InstitucionDTO institucion= InstitucionDTO.build();
	}
	
	
}
