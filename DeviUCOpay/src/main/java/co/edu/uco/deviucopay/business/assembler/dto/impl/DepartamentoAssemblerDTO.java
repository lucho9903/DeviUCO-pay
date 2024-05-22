package co.edu.uco.deviucopay.business.assembler.dto.impl;

import static co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper.getObjectHelper;

import co.edu.uco.deviucopay.business.assembler.Assembler;
import co.edu.uco.deviucopay.business.assembler.dto.AssemblerDTO;
import co.edu.uco.deviucopay.business.domain.DepartamentoDomain;
import co.edu.uco.deviucopay.business.domain.PaisDomain;
import co.edu.uco.deviucopay.dto.Departamento;
import co.edu.uco.deviucopay.dto.Pais;

public class DepartamentoAssemblerDTO implements Assembler<DepartamentoDomain, Departamento>{
	
	private static final AssemblerDTO<PaisDomain, Pais> paisAssembler = PaisAssemblerDTO.getInstance();
	private static final AssemblerDTO<DepartamentoDomain, Departamento> instance = new DepartamentoAssemblerDTO();
	
	private DepartamentoAssemblerDTO() {
		super();
	}
	
	public static final AssemblerDTO<DepartamentoDomain, Departamento>
		getIntance(){
		return instance;
	}
		
/*
	@Override
	public final Departamento toDTO(final DepartamentoDomain domain) {
	var departamentoDomainTmp = getObjectHelper().getDefaultValue(domain , DepartamentoDomain.build());
	var paisDto = paisAssembler.toDTO(departamentoDomainTmp.getPais());
		return Departamento.build().setId(departamentoDomainTmp.getId()).setNombre(departamentoDomainTmp.getNombre()).setPais(paisDto);

ERROR POR ORGANIZAR 
	}*/

	@Override
	public DepartamentoDomain todomain(Departamento data) {
		var departamentoDtoTmp =getObjectHelper().getDefaultValue(data , Departamento.build());
		var paisDomain = paisAssembler.todomain(departamentoDtoTmp.getPais());
		return DepartamentoDomain.build(departamentoDtoTmp.getId(),departamentoDtoTmp.getNombre(), paisDomain );
	}
}
	