package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.CarnetDomain;
import co.edu.uco.deviucopay.dto.CarnetDTO;

public class CarnetAssemblerDTO implements AssemblerDTO<CarnetDomain, CarnetDTO> {

	private static final AssemblerDTO<CarnetDomain, CarnetDTO>  instance = new CarnetAssemblerDTO();
	
	
	private CarnetAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<CarnetDomain, CarnetDTO> getInstance(){
		return instance;
	}
	@Override
	public final CarnetDomain todomain(final CarnetDTO date) {
		var carnetDtoTmp =getObjectHelper().getDefaultValue(date , CarnetDTO.build());
	
		return CarnetDomain.build(carnetDtoTmp.getId(),carnetDtoTmp.getNumeroCarnet());
	}

	@Override
	public final CarnetDTO toDTO(final CarnetDomain domain) {
		
	var carnetDomainTmp = getObjectHelper().getDefaultValue(domain , carnetDomain.build());
	
		return CarnetDTO.build().setId(carnetDomainTmp.getId()).setNombre(carnetDomainTmp.getNombre());
	}
}