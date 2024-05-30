package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;


import java.util.List;
import java.util.ArrayList;
import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.CarnetDomain;
import co.edu.uco.deviucopay.dto.CarnetDTO;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

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

	@Override
	public final List<CarnetDomain> toDomainCollection(final List<CarnetDTO> dtoCollection) {
		var dtoCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(dtoCollection, new ArrayList<CarnetDTO>());
		var resultadoDomain = new ArrayList<CarnetDomain>();
		
		for (CarnetDTO carnetDto : dtoCollectionTmp) {
			var carnetDomainTmp = toDomain(carnetDto);
			resultadoDomain.add(carnetDomainTmp);
		}
		
		return resultadoDomain;
	}

	@Override
	public final List<CarnetDTO> toDTOCollection(final List<CarnetDomain> domainCollection) {
		var domainCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(domainCollection, new ArrayList<CarnetDomain>());
		return domainCollectionTmp.stream().map(this::toDTO).toList();
	}
}