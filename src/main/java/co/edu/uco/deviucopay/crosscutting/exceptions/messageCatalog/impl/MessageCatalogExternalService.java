package co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.impl;

import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.MessageCatalog;
import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.data.CodigoMensaje;
import co.edu.uco.deviucopay.crosscutting.exceptions.messageCatalog.data.Mensaje;

public  class MessageCatalogExternalService implements MessageCatalog {

	@Override
	public final void inicializar() {		
	}

	@Override
	public final String obtenerContendidoMensaje(final CodigoMensaje codigo, String... parametros) {
		return null;
	}

	@Override
	public final Mensaje obtenerMensaje(final CodigoMensaje codigo, String... parametros) {
		return null;
	}

}
