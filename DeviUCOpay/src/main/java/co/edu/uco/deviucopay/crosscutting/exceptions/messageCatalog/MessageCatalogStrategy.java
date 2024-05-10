package co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog;

import co.edu.uco.deviucopay.crosscutting.exceptions.customs.CrossCuttingDeviUcopayException;
import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.data.CodigoMensaje;
import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.data.Mensaje;
import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.impl.MessageCatalogBase;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;


public class MessageCatalogStrategy {
	private static final MessageCatalog base = new MessageCatalogBase();
	private static final MessageCatalog externalService= new MessageCatalogBase();
	
	private MessageCatalogStrategy() {
		super();
	}
	
	public static void inicializar() {
		base.inicializar();
		externalService.inicializar();
	}
	
	private static final MessageCatalog getStrategy(final boolean isBase) {
		return isBase ? base: externalService;
	}
	
	public static final Mensaje getMensaje(final CodigoMensaje codigo,
			final String...parametros){
		if (ObjectHelper.getObjectHelper().isNull(codigo)) {
			throw new CrossCuttingDeviUcopayException(null, null);
		}
		return getStrategy(codigo.isBase())
				.obtenerMensaje(codigo, parametros);
	}
}