package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.TipoCuentaDomain;
import co.edu.uco.deviucopay.dto.TipoCuentaDTO;

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
}