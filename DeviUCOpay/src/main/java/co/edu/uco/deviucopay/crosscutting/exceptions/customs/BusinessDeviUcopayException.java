package co.edu.uco.deviucopay.crosscutting.exceptions.customs;
import co.edu.uco.deviucopay.crosscutting.exceptions.DeviUcopayException;
import co.edu.uco.deviucopay.crosscutting.exceptions.enums.Lugar;

public final class BusinessDeviUcopayException extends DeviUcopayException{
	
	private static final long serialVersionUID = -3662331984905572117L;

	public BusinessDeviUcopayException(final String mensajeUsuario , Lugar lugar) {
		super(mensajeUsuario, Lugar.BUSINESS);
	}
	
	public BusinessDeviUcopayException(final String mensajeTecnico,final String mensajeUsuario, 
			final Throwable exceptionRaiz) {
		super(mensajeTecnico,mensajeUsuario, Lugar.BUSINESS, exceptionRaiz);
	}
	
	
	
}
