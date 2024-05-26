package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.TipoInstitucionDomain;
import co.edu.uco.deviucopay.dto.TipoInstitucionDTO;

public class TipoInstitucionAssemblerDTO implements AssemblerDTO<TipoInstitucionDomain, TipoInstitucionDTO> {

	private static final AssemblerDTO<TipoInstitucionDomain, TipoInstitucionDTO>  instance = new TipoInstitucionAssemblerDTO();
	
	
	private TipoInstitucionAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<TipoInstitucionDomain, TipoInstitucionDTO> getInstance(){
		return instance;
	}
	@Override
	public final TipoInstitucionDomain todomain(final TipoInstitucionDTO date) {
		var tipoInstitucionDtoTmp =getObjectHelper().getDefaultValue(date , TipoInstitucionDTO.build());
	
		return TipoInstitucionDomain.build(tipoInstitucionDtoTmp.getId(),tipoInstitucionDtoTmp.getNombre());
	}

	@Override
	public final TipoInstitucionDTO toDTO(final TipoInstitucionDomain domain) {
		
	var tipoInstitucionDomainTmp = getObjectHelper().getDefaultValue(domain , TipoInstitucionDomain.build());
	
		return TipoInstitucionDTO.build().setId(tipoInstitucionDomainTmp.getId()).setNombre(tipoInstitucionDomainTmp.getNombre());
	}
}