package co.edu.uco.deviucopay.business.assembler.entity;

import co.edu.uco.deviucopay.business.assembler.Assembler;

public interface AssamblerEntity<D, K > extends Assembler<D, K> {
	
	K toEntity(D domain);
}
