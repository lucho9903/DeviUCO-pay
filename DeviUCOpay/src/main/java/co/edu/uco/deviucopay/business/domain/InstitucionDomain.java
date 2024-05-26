package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;
import co.edu.uco.deviucopay.dto.TipoInstitucionDTO;

public class InstitucionDomain {
    private UUID id;
    private String nombre;
    private TipoInstitucionDTO tipoInstitucion;
    private String correo;

    private InstitucionDomain(final UUID id, final String nombre, final TipoInstitucionDTO tipoInstitucion, final String correo) {
        setId(id);
        setNombre(nombre);
        setTipoInstitucion(tipoInstitucion);
        setCorreo(correo);
    }

    public static InstitucionDomain build(final UUID id, final String nombre, final TipoInstitucionDTO tipoInstitucion, final String correo) {
        return new InstitucionDomain(id, nombre, tipoInstitucion, correo);
    }

    public static InstitucionDomain build(final UUID id) {
        return new InstitucionDomain(id, TextHelper.EMPTY, new TipoInstitucionDTO(), TextHelper.EMPTY);
    }

    public static InstitucionDomain build() {
        return new InstitucionDomain(UUIDHelper.getDefault(), TextHelper.EMPTY, new TipoInstitucionDTO(), TextHelper.EMPTY);
    }

    private final void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    private final void setNombre(String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private final void setTipoInstitucion(TipoInstitucionDTO tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion == null ? new TipoInstitucionDTO() : tipoInstitucion;
    }

    private final void setCorreo(String correo) {
        this.correo = TextHelper.applyTrim(correo);
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoInstitucionDTO getTipoInstitucion() {
        return tipoInstitucion;
    }

    public String getCorreo() {
        return correo;
    }
}
