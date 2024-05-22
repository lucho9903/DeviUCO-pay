package co.edu.uco.deviucopay.entity;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public final class CiudadEntity {
	private UUID id;
	private String nombre;
	private DepartamentoEntity departamento;
	
	
	public CiudadEntity(){
		super();
		
	}
	
	public CiudadEntity(UUID id, String nombre, DepartamentoEntity departamento) {
		super();
		setId (id);
		setNombre (nombre);
		setDepartamento(departamento);
	}



	public static final CiudadEntity buil() {
		return new CiudadEntity();
	}

	public UUID getId() {
		return id;
	}
	public CiudadEntity setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final CiudadEntity setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
		return this;
	}
	public final DepartamentoEntity getDepartamento() {
		return departamento;
	}
	public final void setDepartamento(final DepartamentoEntity departamento) {
		this.departamento = ObjectHelper.getObjectHelper().getDefaultValue(departamento, new DepartamentoEntity());
	}
	
	

}