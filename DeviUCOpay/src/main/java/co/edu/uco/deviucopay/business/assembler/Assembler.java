package co.edu.uco.deviucopay.business.assembler;
import java.util.List;

public interface Assembler <D, K>{
	
	D todomain (K data);
	List<D> toDomainCollection(List<K> entituCollection);
	
}
