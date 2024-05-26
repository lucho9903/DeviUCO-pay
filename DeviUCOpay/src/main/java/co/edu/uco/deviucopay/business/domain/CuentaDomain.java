package co.edu.uco.deviucopay.business.domain;

public class CuentaDomain {
    private Long numeroCuenta;
    private Integer contrasena;
    private Float saldo;
    private AfiliadoDomain afiliado;
    private TipoCuentaDomain tipoCuenta;

    private CuentaDomain(final Long numeroCuenta, final Integer contrasena, final Float saldo, final AfiliadoDomain afiliado, final TipoCuentaDomain tipoCuenta) {
        setNumeroCuenta(numeroCuenta);
        setContrasena(contrasena);
        setSaldo(saldo);
        setAfiliado(afiliado);
        setTipoCuenta(tipoCuenta);
    }

    public static CuentaDomain build(final Long numeroCuenta, final Integer contrasena, final Float saldo, final AfiliadoDomain afiliado, final TipoCuentaDomain tipoCuenta) {
        return new CuentaDomain(numeroCuenta, contrasena, saldo, afiliado, tipoCuenta);
    }

    public static CuentaDomain build() {
        return new CuentaDomain(0L, 0, 0.0f,AfiliadoDomain.build(),TipoCuentaDomain.build());
    }

    private final void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private final void setContrasena(Integer contrasena) {
        this.contrasena = contrasena;
    }

    private final void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    private final void setAfiliado(AfiliadoDomain afiliado) {
        this.afiliado = afiliado;
    }

    private final void setTipoCuenta(TipoCuentaDomain tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
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

	public AfiliadoDomain getAfiliado() {
		return afiliado;
	}

	public TipoCuentaDomain getTipoCuenta() {
		return tipoCuenta;
	}

   
}
