package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class AfiliadoDomain {
    private UUID id;
    private Long numeroIdAfiliado;
    private String nombre;
    private String correo;
    private Long telefono;
    private TipoIdentificacionDomain tipoIdentificacion;
    private InstitucionDomain institucion;
    private CarnetDomain carnet;

    private AfiliadoDomain(final UUID id, final Long numeroIdAfiliado, final String nombre, final String correo, final Long telefono, final TipoIdentificacionDomain tipoIdentificacion, final InstitucionDomain institucion, final CarnetDomain carnet) {
        setId(id);
        setNumeroIdAfiliado(numeroIdAfiliado);
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
        setTipoIdentificacion(tipoIdentificacion);
        setInstitucion(institucion);
        setCarnet(carnet);
    }

    public static AfiliadoDomain build(final UUID id, final Long numeroIdAfiliado, final String nombre, final String correo, final Long telefono, final TipoIdentificacionDomain tipoIdentificacion, final InstitucionDomain institucion, final CarnetDomain carnet) {
        return new AfiliadoDomain(id, numeroIdAfiliado, nombre, correo, telefono, tipoIdentificacion, institucion, carnet);
    }

    public static AfiliadoDomain build(final UUID id) {
        return new AfiliadoDomain(id, 0L, TextHelper.EMPTY, TextHelper.EMPTY, 0L, TipoIdentificacionDomain.build(), InstitucionDomain.build(), CarnetDomain.build());
    }

    public static AfiliadoDomain build() {
        return new AfiliadoDomain(UUIDHelper.getDefault(), 0L, TextHelper.EMPTY, TextHelper.EMPTY, 0L, TipoIdentificacionDomain.build(), InstitucionDomain.build(), CarnetDomain.build());
    }

    private final void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    private final void setNumeroIdAfiliado(Long numeroIdAfiliado) {
        this.numeroIdAfiliado = numeroIdAfiliado == null ? 0L : numeroIdAfiliado;
    }

    private final void setNombre(String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private final void setCorreo(String correo) {
        this.correo = TextHelper.applyTrim(correo);
    }

    private final void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    private final void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
        this.tipoIdentificacion = TipoIdentificacionDomain.build();
    }

    private final void setInstitucion(InstitucionDomain institucion) {
        this.institucion = institucion;
    }

    private final void setCarnet(CarnetDomain carnet) {
        this.carnet = carnet;
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

    public TipoIdentificacionDomain getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public InstitucionDomain getInstitucion() {
        return institucion;
    }

    public CarnetDomain getCarnet() {
        return carnet;
    }
}
