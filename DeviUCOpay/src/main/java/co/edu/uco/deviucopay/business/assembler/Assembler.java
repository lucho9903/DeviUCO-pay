package co.edu.uco.deviucopay.business.assembler;
import java.util.List;

import co.edu.uco.deviucopay.business.domain.AfiliadoDomain;
import co.edu.uco.deviucopay.dto.AfiliadoDTO;

public interface Assembler <D, K>{
	
	D toDomain (K data);
	List<D> toDomainCollection(List<K> entityCollection);
	
}
