package co.edu.uco.deviucopay.business.assembler.entity.impl;

import co.edu.uco.deviucopay.business.assembler.entity.AssamblerEntity;
import co.edu.uco.deviucopay.business.domain.CiudadDomain;
import co.edu.uco.deviucopay.business.domain.DepartamentoDomain;
import co.edu.uco.deviucopay.entity.CiudadEntity;
import co.edu.uco.deviucopay.entity.DepartamentoEntity;

public class CiudadAssemblerEntity implements AssamblerEntity<CiudadDomain, CiudadEntity>{

	private static final AssamblerEntity<CiudadDomain, CiudadEntity> instance = new CiudadAssemblerEntity();
	private static final AssamblerEntity<DepartamentoDomain,DepartamentoEntity> departamentoAssembler =  DepartamentoAssemblerEntity.getInstance();
	
	private CiudadAssemblerEntity () {
		super();
	}
	
	public static final AssamblerEntity<CiudadDomain, CiudadEntity> getInstance(){
		return instance;
	}
	
	@Override
	public CiudadDomain todomain(CiudadEntity data) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final CiudadEntity toEntity(final CiudadDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}
}
	