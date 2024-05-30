package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import java.util.List;
import java.util.ArrayList;
import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.TipoCuentaDomain;
import co.edu.uco.deviucopay.dto.TipoCuentaDTO;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class TipoCuentaAssemblerDTO implements AssemblerDTO<TipoCuentaDomain, TipoCuentaDTO> {

	private static final AssemblerDTO<TipoCuentaDomain, TipoCuentaDTO>  instance = new TipoCuentaAssemblerDTO();
	
	
	private TipoCuentaAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<TipoCuentaDomain, TipoCuentaDTO> getInstance(){
		return instance;
	}
	@Override
	public final TipoCuentaDomain todomain(final TipoCuentaDTO date) {
		var tipoCuentaDtoTmp =getObjectHelper().getDefaultValue(date , TipoCuentaDTO.build());
	
		return TipoCuentaDomain.build(tipoCuentaDtoTmp.getId(),tipoCuentaDtoTmp.getNombre(), tipoCuentaDtoTmp.getIdentificadorTipoCuenta());
	}

	@Override
	public final TipoCuentaDTO toDTO(final TipoCuentaDomain domain) {
		
	var tipoCuentaDomainTmp = getObjectHelper().getDefaultValue(domain , TipoCuentaDomain.build());
	
		return TipoCuentaDTO.build().setId(tipoCuentaDomainTmp.getId()).setNombre(tipoCuentaDomainTmp.getNombre());
	}

	@Override
	public final List<TipoCuentaDomain> toDomainCollection(final List<TipoCuentaDTO> dtoCollection) {
		var dtoCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(dtoCollection, new ArrayList<TipoCuentaDTO>());
		var resultadoDomain = new ArrayList<TipoCuentaDomain>();
		
		for (TipoCuentaDTO carnetDto : dtoCollectionTmp) {
			var tipoCuentaDomainTmp = toDomain(tipoCuentaDto);
			resultadoDomain.add(tipoCuentaDomainTmp);
		}
		
		return resultadoDomain;
	}

	@Override
	public final List<TipoCuentaDTO> toDTOCollection(final List<TipoCuentaDomain> domainCollection) {
		var domainCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(domainCollection, new ArrayList<TipoCuentaDomain>());
		return domainCollectionTmp.stream().map(this::toDTO).toList();
	}
}