package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class CarnetDTO {
	
	private UUID id;
	private String numeroCarnet;
	
	
	public CarnetDTO(UUID id, String numeroCarnet) {
		setId(id);
		setNumeroCarnet(numeroCarnet);
	}

	public CarnetDTO() {
		super();
	}
	
	public static CarnetDTO build() {
		return new CarnetDTO();
		
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault();
	}
	
	public String getNumeroCarnet() {
		return numeroCarnet;
	}
	
	public void setNumeroCarnet(String numeroCarnet) {
		this.numeroCarnet = TextHelper.applyTrim(numeroCarnet);
	}
	
	

}
