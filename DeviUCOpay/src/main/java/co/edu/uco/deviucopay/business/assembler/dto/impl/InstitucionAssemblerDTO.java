package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.InstitucionDomain;
import co.edu.uco.deviucopay.dto.InstitucionDTO;

public class InstitucionAssemblerDTO implements AssemblerDTO<InstitucionDomain, InstitucionDTO> {

	private static final AssemblerDTO<InstitucionDomain, InstitucionDTO>  instance = new InstitucionAssemblerDTO();
	
	
	private InstitucionAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<InstitucionDomain, InstitucionDTO> getInstance(){
		return instance;
	}
	@Override
	public final InstitucionDomain todomain(final InstitucionDTO date) {
		var institucionDtoTmp =getObjectHelper().getDefaultValue(date , InstitucionDTO.build());
	
		return InstitucionDomain.build(institucionDtoTmp.getId(),institucionDtoTmp.getNombre(), institucionDtoTmp.getTipoInstitucion(), institucionDtoTmp.getCorreo());
	}

	@Override
	public final InstitucionDTO toDTO(final InstitucionDomain domain) {
		
	var institucionDomainTmp = getObjectHelper().getDefaultValue(domain , InstitucionDomain.build());
	
		return InstitucionDTO.build().setId(institucionDomainTmp.getId()).setNombre(institucionDomainTmp.getNombre());
	}
}