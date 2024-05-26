package co.edu.uco.deviucopay.entity;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class CarnetEntity {
	
	private UUID id;
	private Long numeroCarnet;
	
	
	
	
	
	public CarnetEntity(UUID id, Long numeroCarnet) {
		setId(id);
		setNumeroCarnet(numeroCarnet);
	}

	public CarnetEntity() {
		super();
	}
	
	public static CarnetEntity build() {
		return new CarnetEntity();
		
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, null);
	}
	
	public Long getNumeroCarnet() {
		return numeroCarnet;
	}
	
	public void setNumeroCarnet(Long numeroCarnet) {
		this.numeroCarnet = LongHelper.getDefaultValue(numeroCarnet);
	}
		
	

}
