package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public final class Pais {
	private UUID id;
	private String nombre;
	
	public Pais() {
		super();
	}
	
	
	
	public Pais(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public static final Pais buil() {
		return new Pais();
	}

	public final UUID getId() {
		return id;
	}
	public final Pais setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final  String getNombre() {
		return nombre;
	}
	public final Pais setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
		return this;
	}

	
}
