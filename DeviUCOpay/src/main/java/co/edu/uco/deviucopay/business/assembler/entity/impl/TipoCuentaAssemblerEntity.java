package co.edu.uco.deviucopay.business.assembler.entity.impl;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.deviucopay.business.assembler.entity.AssemblerEntity;
import co.edu.uco.deviucopay.business.domain.TipoCuentaDomain;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.entity.TipoCuentaEntity;

public class TipoCuentaAssemblerEntity implements AssemblerEntity<TipoCuentaDomain, TipoCuentaEntity>{

	private static final AssemblerEntity<TipoCuentaDomain, TipoCuentaEntity> instance=new TipoCuentaAssemblerEntity();
	
	private TipoCuentaAssemblerEntity() {
		super();
	}
	
	public static final AssemblerEntity<TipoCuentaDomain, TipoCuentaEntity> getInstance(){
		return instance;
	}
	@Override
	public final TipoCuentaDomain toDomain(final TipoCuentaEntity data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoCuentaDomain> toDomainCollection(final List<TipoCuentaEntity> entityCollection) {
		var entityCollectionTmp = ObjectHelper.getObjectHelper()
				.getDefaultValue(entityCollection,new ArrayList<TipoCuentaEntity>());
		
		return entityCollectionTmp.stream()
				.map(this::toDomain).toList();
	}

	@Override
	public final TipoCuentaEntity toEntity(final TipoCuentaDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
