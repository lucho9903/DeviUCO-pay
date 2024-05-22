package co.edu.uco.deviucopay.business.assembler.entity.impl;

import co.edu.uco.deviucopay.business.assembler.entity.AssamblerEntity;
import co.edu.uco.deviucopay.business.domain.DepartamentoDomain;
import co.edu.uco.deviucopay.business.domain.PaisDomain;
import co.edu.uco.deviucopay.entity.DepartamentoEntity;
import co.edu.uco.deviucopay.entity.PaisEntity;

public class DepartamentoAssemblerEntity implements AssamblerEntity<DepartamentoDomain, DepartamentoEntity>{

	private static final AssamblerEntity<DepartamentoDomain, DepartamentoEntity> instance = new DepartamentoAssemblerEntity();
	private static final AssamblerEntity<PaisDomain, PaisEntity> paisAssembler =  PaisAssemblerEntity.getInstance();
	
	private DepartamentoAssemblerEntity () {
		super();
	}
	
	public static final AssamblerEntity<DepartamentoDomain, DepartamentoEntity> getInstance(){
		return instance;
	}

	@Override
	public final DepartamentoDomain todomain(final DepartamentoEntity data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final DepartamentoEntity toEntity(final DepartamentoDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}
}

	