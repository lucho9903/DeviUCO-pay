package co.edu.uco.deviucopay.business.assembler.entity.impl;

import co.edu.uco.deviucopay.business.assembler.entity.AssamblerEntity;
import co.edu.uco.deviucopay.business.domain.PaisDomain;
import co.edu.uco.deviucopay.entity.PaisEntity;

public class PaisAssemblerEntity  implements AssamblerEntity<PaisDomain, PaisEntity>{

	private static final AssamblerEntity<PaisDomain, PaisEntity> instance = new PaisAssemblerEntity();
	
	private PaisAssemblerEntity () {
		super();
	}
	
	public static final AssamblerEntity<PaisDomain, PaisEntity> getInstance(){
		return instance;
	}
	
	@Override
	public PaisDomain todomain(PaisEntity data) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PaisEntity toEntity(PaisDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
