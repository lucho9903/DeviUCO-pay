package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public class Ciudad {
	private UUID id;
	private String nombre;
	private Departamento departamento;
	
	
	public Ciudad(){
		super();
		
	}
	
	
	
	public Ciudad(UUID id, String nombre, Departamento departamento) {
		super();
		setId (id);
		setNombre (nombre);
		setDepartamento(departamento);
	}



	public static final Ciudad buil() {
		return new Ciudad();
	}

	public UUID getId() {
		return id;
	}
	public Ciudad setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final Ciudad setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
		return this;
	}
	public final Departamento getDepartamento() {
		return departamento;
	}
	public final void setDepartamento(final Departamento departamento) {
		this.departamento = ObjectHelper.getObjectHelper().getDefaultValue(departamento, new Departamento());;
	}

}
