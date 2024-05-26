package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;
import co.edu.uco.deviucopay.dto.CarnetDTO;
import co.edu.uco.deviucopay.dto.InstitucionDTO;
import co.edu.uco.deviucopay.dto.TipoIdentificacionDTO;

public class AfiliadoDomain {
    private UUID id;
    private Long numeroIdAfiliado;
    private String nombre;
    private String correo;
    private Long telefono;
    private TipoIdentificacionDTO tipoIdentificacion;
    private InstitucionDTO institucion;
    private CarnetDTO carnet;

    private AfiliadoDomain(final UUID id, final Long numeroIdAfiliado, final String nombre, final String correo, final Long telefono, final TipoIdentificacionDTO tipoIdentificacion, final InstitucionDTO institucion, final CarnetDTO carnet) {
        setId(id);
        setNumeroIdAfiliado(numeroIdAfiliado);
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
        setTipoIdentificacion(tipoIdentificacion);
        setInstitucion(institucion);
        setCarnet(carnet);
    }

    public static AfiliadoDomain build(final UUID id, final Long numeroIdAfiliado, final String nombre, final String correo, final Long telefono, final TipoIdentificacionDTO tipoIdentificacion, final InstitucionDTO institucion, final CarnetDTO carnet) {
        return new AfiliadoDomain(id, numeroIdAfiliado, nombre, correo, telefono, tipoIdentificacion, institucion, carnet);
    }
    
    public static AfiliadoDomain build(final UUID id) {
        return new AfiliadoDomain(id, 0L, TextHelper.EMPTY, TextHelper.EMPTY, 0L, new TipoIdentificacionDTO(), new InstitucionDTO(), new CarnetDTO());
    }
    
    public static AfiliadoDomain build() {
        return new AfiliadoDomain(UUIDHelper.getDefault(), 0L, TextHelper.EMPTY, TextHelper.EMPTY, 0L, new TipoIdentificacionDTO(), new InstitucionDTO(), new CarnetDTO());
    }

    private final void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    private final void setNumeroIdAfiliado(Long numeroIdAfiliado) {
        this.numeroIdAfiliado = numeroIdAfiliado == null ? 0L : numeroIdAfiliado;
    }

    private final void setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion = (tipoIdentificacion == null);
    }
    

    public UUID getId() {
		return id;
	}

	public Long getNumeroIdAfiliado() {
		return numeroIdAfiliado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public InstitucionDTO getInstitucion() {
		return institucion;
	}

	public CarnetDTO getCarnet() {
		return carnet;
	}

	private final void setNombre(String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private final void setCorreo(String correo) {
        this.correo = TextHelper.applyTrim(correo);
    }

    private final void setTelefono(Long telefono) {
        this.telefono = telefono == null ? 0L : telefono;
    }

}
