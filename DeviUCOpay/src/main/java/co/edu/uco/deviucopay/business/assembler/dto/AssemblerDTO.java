package co.edu.uco.deviucopay.business.assembler.dto;

import co.edu.uco.deviucopay.business.assembler.Assembler;

public interface AssemblerDTO<D, K> extends Assembler<D, K> {
	
	K toDTO(D domain);

}
