package co.edu.uco.deviucopay.business.domain;

import co.edu.uco.deviucopay.dto.AfiliadoDTO;
import co.edu.uco.deviucopay.dto.TipoCuentaDTO;

public class CuentaDomain {
    private Long numeroCuenta;
    private Integer contrasena;
    private Float saldo;
    private AfiliadoDTO afiliado;
    private TipoCuentaDTO tipoCuenta;

    private CuentaDomain(final Long numeroCuenta, final Integer contrasena, final Float saldo, final AfiliadoDTO afiliado, final TipoCuentaDTO tipoCuenta) {
        setNumeroCuenta(numeroCuenta);
        setContrasena(contrasena);
        setSaldo(saldo);
        setAfiliado(afiliado);
        setTipoCuenta(tipoCuenta);
    }

    public static CuentaDomain build(final Long numeroCuenta, final Integer contrasena, final Float saldo, final AfiliadoDTO afiliado, final TipoCuentaDTO tipoCuenta) {
        return new CuentaDomain(numeroCuenta, contrasena, saldo, afiliado, tipoCuenta);
    }

    public static CuentaDomain build() {
        return new CuentaDomain(0L, 0, 0.0f, new AfiliadoDTO(), new TipoCuentaDTO());
    }

    private final void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta == null ? 0L : numeroCuenta;
    }

    private final void setContrasena(Integer contrasena) {
        this.contrasena = contrasena == null ? 0 : contrasena;
    }

    private final void setSaldo(Float saldo) {
        this.saldo = saldo == null ? 0.0f : saldo;
    }

    private final void setAfiliado(AfiliadoDTO afiliado) {
        this.afiliado = afiliado == null ? new AfiliadoDTO() : afiliado;
    }

    private final void setTipoCuenta(TipoCuentaDTO tipoCuenta) {
        this.tipoCuenta = tipoCuenta == null ? new TipoCuentaDTO() : tipoCuenta;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public Integer getContrasena() {
        return contrasena;
    }

    public Float getSaldo() {
        return saldo;
    }

    public AfiliadoDTO getAfiliado() {
        return afiliado;
    }

    public TipoCuentaDTO getTipoCuenta() {
        return tipoCuenta;
    }
}
