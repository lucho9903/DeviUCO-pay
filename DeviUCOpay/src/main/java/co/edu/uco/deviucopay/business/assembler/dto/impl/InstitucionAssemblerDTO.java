package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import java.util.List;
import java.util.ArrayList;
import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.InstitucionDomain;
import co.edu.uco.deviucopay.dto.InstitucionDTO;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

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

	@Override
	public final List<InstitucionDomain> toDomainCollection(final List<InstitucionDTO> dtoCollection) {
		var dtoCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(dtoCollection, new ArrayList<InstitucionDTO>());
		var resultadoDomain = new ArrayList<InstitucionDomain>();
		
		for (InstitucionDTO institucionDto : dtoCollectionTmp) {
			var institucionDomainTmp = todomain(institucionDto);
			resultadoDomain.add(institucionDomainTmp);
		}
		
		return resultadoDomain;
	}

	@Override
	public final List<InstitucionDTO> toDTOCollection(final List<InstitucionDomain> domainCollection) {
		var domainCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(domainCollection, new ArrayList<InstitucionDomain>());
		return domainCollectionTmp.stream().map(this::toDTO).toList();
	}
}