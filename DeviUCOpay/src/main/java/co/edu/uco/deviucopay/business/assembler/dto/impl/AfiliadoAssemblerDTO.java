package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import java.util.List;
import java.util.ArrayList;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.AfiliadoDomain;
import co.edu.uco.deviucopay.dto.AfiliadoDTO;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class AfiliadoAssemblerDTO implements AssemblerDTO<AfiliadoDomain, AfiliadoDTO> {

	private static final AssemblerDTO<AfiliadoDomain, AfiliadoDTO>  instance = new AfiliadoAssemblerDTO();
	
	
	private AfiliadoAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<AfiliadoDomain, AfiliadoDTO> getInstance(){
		return instance;
	}
	@Override
	public final AfiliadoDomain todomain(final AfiliadoDTO date) {
		var afiliadoDomainTmp =getObjectHelper().getDefaultValue(date , AfiliadoDTO.build());
	
		return AfiliadoDomain.build(afiliadoDomainTmp.getId(),afiliadoDomainTmp.getNumeroIdAfiliado(),afiliadoDomainTmp.getNombre(),afiliadoDomainTmp.getCorreo(),afiliadoDomainTmp.getTelefono(), afiliadoDomainTmp.getTipoIdentificacion(), afiliadoDomainTmp.getInstitucion(), afiliadoDomainTmp.getCarnet());
	}

	@Override
	public final List<AfiliadoDomain> toDomainCollection(final List<AfiliadoDTO> dtoCollection) {
		var dtoCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(dtoCollection, new ArrayList<AfiliadoDTO>());
		var resultadoDomain = new ArrayList<AfiliadoDomain>();
		
		for (AfiliadoDTO afiliadoDto : dtoCollectionTmp) {
			var afiliadoDomainTmp = toDomain(afiliadoDto);
			resultadoDomain.add(afiliadoDomainTmp);
		}
		
		return resultadoDomain;
	}

	@Override
	public AfiliadoDTO toDTO(AfiliadoDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final List<AfiliadoDTO> toDTOCollection(final List<AfiliadoDomain> domainCollection) {
		var domainCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(domainCollection, new ArrayList<AfiliadoDomain>());
		return domainCollectionTmp.stream().map(this::toDTO).toList();
	}

	
}
