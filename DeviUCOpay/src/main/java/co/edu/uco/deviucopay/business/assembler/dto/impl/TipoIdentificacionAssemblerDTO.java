package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import java.util.List;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.TipoCuentaDomain;
import co.edu.uco.deviucopay.business.domain.TipoIdentificacionDomain;
import co.edu.uco.deviucopay.dto.TipoCuentaDTO;
import co.edu.uco.deviucopay.dto.TipoIdentificacionDTO;

public class TipoIdentificacionAssemblerDTO implements AssemblerDTO<TipoIdentificacionDomain, TipoIdentificacionDTO> {

	private static final AssemblerDTO<TipoIdentificacionDomain, TipoIdentificacionDTO>  instance = new TipoIdentificacionAssemblerDTO();
	
	
	private TipoIdentificacionAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<TipoIdentificacionDomain, TipoIdentificacionDTO> getInstance(){
		return instance;
	}
	@Override
	public final TipoIdentificacionDomain todomain(final TipoIdentificacionDTO date) {
		var tipoIdentificacionDtoTmp =getObjectHelper().getDefaultValue(date , TipoIdentificacionDTO.build());
	
		return TipoIdentificacionDomain.build(tipoIdentificacionDtoTmp.getId(),tipoIdentificacionDtoTmp.getNombre());
	}

	@Override
	public final TipoIdentificacionDTO toDTO(final TipoIdentificacionDomain domain) {
		
	var tipoIdentificacionDomainTmp = getObjectHelper().getDefaultValue(domain , TipoCuentaDomain.build());
	
		return TipoCuentaDTO.build().setId(tipoIdentificacionDomainTmp.getId()).setNombre(tipoIdentificacionDomainTmp.getNombre()).set;
	}

	@Override
	public List<TipoIdentificacionDomain> toDomainCollection(List<TipoIdentificacionDTO> entituCollection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoIdentificacionDTO> toDTOCollection(List<TipoIdentificacionDomain> domainCollection) {
		// TODO Auto-generated method stub
		return null;
	}
}