package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class CarnetDTO {
	
	private UUID id;
	private Long numeroCarnet;
	
	
	
	
	
	public CarnetDTO(UUID id, Long numeroCarnet) {
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
		this.id = UUIDHelper.obtenerValorDefecto(id);
	}
	
	public Long getNumeroCarnet() {
		return numeroCarnet;
	}
	
	public void setNumeroCarnet(Long numeroCarnet) {
		this.numeroCarnet = LongHelper.getDefaultValue(numeroCarnet);
	}
	
	public static void main(String[] args) {
		CarnetDTO carnet = CarnetDTO.build(); 		
	}
	
	
	

}
