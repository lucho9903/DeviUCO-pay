package co.edu.uco.deviucopay.business.assembler.dto.impl;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.CiudadDomain;
import co.edu.uco.deviucopay.dto.Ciudad;
import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

public class CiudadAssemblerDTO implements AssemblerDTO<CiudadDomain, Ciudad> {

	private static final AssemblerDTO<CiudadDomain, Ciudad>  instance = new CiudadAssemblerDTO();
	
	
	private CiudadAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<CiudadDomain, Ciudad> getInstance(){
		return instance;
	}
	
	@Override
	public CiudadDomain todomain(final Ciudad date) {
		var ciudadDtoTmp =getObjectHelper().getDefaultValue(date , Ciudad.buil());
		
		return CiudadDomain.build(ciudadDtoTmp.getId(),ciudadDtoTmp.getNombre(), null);
		// TODO Auto-generated method stub
	}
	

	public final Ciudad toDTO(final CiudadDomain domain) {
		
	var ciudadDomainTmp = getObjectHelper().getDefaultValue(domain , CiudadDomain.build());
	
		return Ciudad.buil().setId(ciudadDomainTmp.getId()).setNombre(ciudadDomainTmp.getNombre());
	}

	






}