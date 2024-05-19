package co.edu.uco.deviucopay.data.dao.entity.concrete.azuresql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.deviucopay.crosscutting.exceptions.customs.CrossCuttingDeviUcopayException;
import co.edu.uco.deviucopay.crosscutting.helpers.SQLHelper;
import co.edu.uco.deviucopay.data.dao.entity.TipoInstitucionDAO;
import co.edu.uco.deviucopay.data.dao.entity.concrete.SqlConnection;
import co.edu.uco.deviucopay.entity.TipoInstitucionEntity;

public class TipoInstitucionAzuereSqlDAO extends SqlConnection implements TipoInstitucionDAO {

	@Override
	public final List<TipoInstitucionEntity> consultar(final TipoInstitucionEntity data) {
	    final List<TipoInstitucionEntity> tipoInstituciones = new ArrayList<>();
	    String sentenciasSql =
	            "SELECT id, nombre " +
	            "FROM tipo_institucion ";

	    if (data != null) {
	        boolean whereAdded = false;
	        if (data.getId() != null) {
	            sentenciasSql += "WHERE id = ? ";
	            whereAdded = true;
	        }
	        if (data.getNombre() != null && !data.getNombre().isEmpty()) {
	            sentenciasSql += (whereAdded ? "AND " : "WHERE ") + "nombre LIKE ? ";
	            whereAdded = true;
	        }
	    }

	    try (final Connection connection = SQLHelper.obtenerConexion();
	         final PreparedStatement sentenciaSqlPreparada = connection.prepareStatement(sentenciasSql)) {

	        int index = 1;
	        if (data != null) {
	            if (data.getId() != null) {
	                sentenciaSqlPreparada.setObject(index++, data.getId());
	            }
	            if (data.getNombre() != null && !data.getNombre().isEmpty()) {
	                sentenciaSqlPreparada.setString(index++, "%" + data.getNombre() + "%");
	            }
	        }

	        try (var resultado = sentenciaSqlPreparada.executeQuery()) {
	            while (resultado.next()) {
	                TipoInstitucionEntity tipoInstitucion = new TipoInstitucionEntity();
	                tipoInstitucion.setId((UUID) resultado.getObject("id"));
	                tipoInstitucion.setNombre(resultado.getString("nombre"));

	                tipoInstituciones.add(tipoInstitucion);
	            }
	        }

	    } catch (final SQLException exception) {
	        var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
	        var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00007);

	        throw new CrossCuttingDeviUcopayException(mensajeTecnico, mensajeUsuario);
	    }

	    return tipoInstituciones;
	}
}
