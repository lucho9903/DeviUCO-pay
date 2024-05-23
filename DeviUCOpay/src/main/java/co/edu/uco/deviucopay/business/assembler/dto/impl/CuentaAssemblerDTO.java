package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.CuentaDomain;
import co.edu.uco.deviucopay.dto.CuentaDTO;

public class CuentaAssemblerDTO implements AssemblerDTO<CuentaDomain, CuentaDTO> {

	private static final AssemblerDTO<CuentaDomain, CuentaDTO>  instance = new CuentaAssemblerDTO();
	
	
	private CuentaAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<CuentaDomain, CuentaDTO> getInstance(){
		return instance;
	}
	@Override
	public final CuentaDomain todomain(final CuentaDTO date) {
		var cuentaDtoTmp =getObjectHelper().getDefaultValue(date , CuentaDTO.build());
	
		return CuentaDomain.build(cuentaDtoTmp.getId(),cuentaDtoTmp.getNombre(), null);
	}

	@Override
	public final CuentaDTO toDTO(final CuentaDomain domain) {
		
	var cuentaDomainTmp = getObjectHelper().getDefaultValue(domain , cuentaDomain.build());
	
		return CuentaDTO.build().setId(cuentaDomainTmp.get()).setNombre(cuentaDomainTmp.getNombre());
	}
}