package co.edu.uco.deviucopay.business.domain;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class TipoCuentaDomain {
    private UUID id;
    private String nombre;
    private String identificadorTipoCuenta;

    private TipoCuentaDomain(final UUID id, final String nombre, final String identificadorTipoCuenta) {
        setId(id);
        setNombre(nombre);
        setIdentificadorTipoCuenta(identificadorTipoCuenta);
    }

    public static TipoCuentaDomain build(final UUID id, final String nombre, final String identificadorTipoCuenta) {
        return new TipoCuentaDomain(id, nombre, identificadorTipoCuenta);
    }

    public static TipoCuentaDomain build(final UUID id) {
        return new TipoCuentaDomain(id, TextHelper.EMPTY, TextHelper.EMPTY);
    }

    public static TipoCuentaDomain build() {
        return new TipoCuentaDomain(UUIDHelper.getDefault(), TextHelper.EMPTY, TextHelper.EMPTY);
    }

    private final void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    private final void setNombre(String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
    }

    private final void setIdentificadorTipoCuenta(String identificadorTipoCuenta) {
        this.identificadorTipoCuenta = TextHelper.applyTrim(identificadorTipoCuenta);
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificadorTipoCuenta() {
        return identificadorTipoCuenta;
    }
}
