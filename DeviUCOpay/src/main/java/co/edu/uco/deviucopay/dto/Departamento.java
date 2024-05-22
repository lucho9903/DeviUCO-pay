package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public final class Departamento {
	private UUID id;
	private String nombre;
	private Pais pais;

	
	public Departamento() {
		super();
	}
	
	public Departamento(final UUID id, final String nombre, final Pais pais) {
		setId(id);
		setNombre(nombre);
		setPais(pais);
	}
	
	public static final Departamento build() {
		return new Departamento();
	}

	public final UUID getId() {
		return id;
	}
	public final Departamento setId(final UUID id) {
		this.id = id;
		return this;
	}
	public String getNombre() {
		return nombre;
	}
	public final  Departamento setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
		return this;
	}
	public final Pais getPais() {
		return getPais();
	}
	public final  void setPais(final Pais pais) {
		this.pais = ObjectHelper.getObjectHelper().getDefaultValue(pais, new Pais());
	}
	
	
	
}

