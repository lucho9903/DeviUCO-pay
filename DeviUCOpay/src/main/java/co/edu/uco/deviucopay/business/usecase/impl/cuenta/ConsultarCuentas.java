package co.edu.uco.deviucopay.business.usecase.impl.cuenta;

import java.util.List;

import co.edu.uco.deviucopay.business.assembler.entity.impl.CuentaAssemblerEntity;
import co.edu.uco.deviucopay.business.domain.CuentaDomain;
import co.edu.uco.deviucopay.business.usecase.UseCaseWithReturn;
import co.edu.uco.deviucopay.crosscutting.exceptions.customs.BusinessDeviUcopayException;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class ConsultarCuentas implements UseCaseWithReturn<CuentaDomain, List<CuentaDomain>> {

	
	private DAOFactory factory;

    public ConsultarCuentas(final DAOFactory factory){
        if(ObjectHelper.getObjectHelper().isNULL(factory)){
            var mensajeUsuario = "Se ha presentado un porblema tratando de llevar a cabo el registro de una ciudad";
            var mensajeTecnico = "El DAOFactory para crear la ciudad llego nulo...";
            throw new BusinessDeviUcopayException(mensajeTecnico, mensajeUsuario);
        }
        this.factory = factory;
	
    }
        @Override
	public List<CuentaDomain> execute(CuentaDomain data) {
        	var cuentaEntityFilter = CuentaAssemblerEntity.getInstance().toEntity(data);
        	var resultadosEntity = factory.getCuentaDAO().consultar(cuentaEntityFilter);
		// TODO Auto-generated method stub
        	
		return CuentaAssemblerEntity.getInstance().toDomainColletion(resultadosEntity);
	}

}
