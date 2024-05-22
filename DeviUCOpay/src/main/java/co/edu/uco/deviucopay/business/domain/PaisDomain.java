package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class PaisDomain {
	private UUID id;
	private String nombre;
	
	private PaisDomain (final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
	}
	public static PaisDomain build(final UUID id, final String nombre) {
		return new PaisDomain(id, nombre);
	}	
	public static PaisDomain build(final UUID id) {
		return new PaisDomain(id, TextHelper.EMPTY);	
	}
	public static PaisDomain build() {
		return new PaisDomain(UUIDHelper.getDefault(),
				TextHelper.EMPTY);
	}	
	
	private void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	private void setNombre(final String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

}
