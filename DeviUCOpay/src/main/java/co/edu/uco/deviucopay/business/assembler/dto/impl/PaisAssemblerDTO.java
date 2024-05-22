package co.edu.uco.deviucopay.business.assembler.dto.impl;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.PaisDomain;
import co.edu.uco.deviucopay.dto.Pais;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;;


public final class PaisAssemblerDTO  implements AssemblerDTO<PaisDomain, Pais>{

	private static final AssemblerDTO<PaisDomain, Pais> instance = new PaisAssemblerDTO();
	
	private PaisAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<PaisDomain, Pais> getInstance(){
		return instance;
	}
	
	@Override
	public final PaisDomain todomain(final Pais date) {
		var paisDtoTmp =getObjectHelper().getDefaultValue(date , Pais.buil());
	
		return PaisDomain.build(paisDtoTmp.getId(), paisDtoTmp.getNombre());
	}

	@Override
	public final Pais toDTO(final PaisDomain domain) {
		
	var paisDomainTmp = getObjectHelper().getDefaultValue(domain , PaisDomain.build());
	
		return Pais.buil().setId(paisDomainTmp.getId()).setNombre(paisDomainTmp.getNombre());
	}

}
