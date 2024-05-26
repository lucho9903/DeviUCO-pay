package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.AfiliadoDomain;
import co.edu.uco.deviucopay.dto.AfiliadoDTO;

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
		var afiliadoDtoTmp =getObjectHelper().getDefaultValue(date , AfiliadoDTO.build());
	
		return AfiliadoDomain.build(afiliadoDtoTmp.getId(),afiliadoDtoTmp.getNumeroIdAfiliado(),afiliadoDtoTmp.getNombre(),afiliadoDtoTmp.getCorreo(),afiliadoDtoTmp.getTelefono(), afiliadoDtoTmp.getTipoIdentificacion(), afiliadoDtoTmp.getInstitucion(), afiliadoDtoTmp.getCarnet());
	}

	@Override
	public final AfiliadoDTO toDTO(final AfiliadoDomain domain) {
		
	var afiliadoDomainTmp = getObjectHelper().getDefaultValue(domain , AfiliadoDomain.build());
	
		return AfiliadoDTO.build().setId(afiliadoDomainTmp.getId()).setNombre(afiliadoDomainTmp.getNombre());
	}
}
