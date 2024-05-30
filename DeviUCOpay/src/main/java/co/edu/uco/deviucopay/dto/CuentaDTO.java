package co.edu.uco.deviucopay.dto;

import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public class CuentaDTO {
	
	private String numeroCuenta;
	private String contraseña;
	private Float saldo;
	private AfiliadoDTO afiliado;
	private TipoCuentaDTO tipoCuenta;
	
	public CuentaDTO(String numeroCuenta, String contraseña, Float saldo, AfiliadoDTO afiliado,TipoCuentaDTO tipoCuenta) {
		super();
		setNumeroCuenta(numeroCuenta);
		setContraseña(contraseña);
		setSaldo(saldo);
		setAfiliado(afiliado);
		setTipoCuenta(tipoCuenta);
	}
	
	public CuentaDTO() {
		super();
	}
	public static final CuentaDTO build() {
		
		return new CuentaDTO();
		
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = TextHelper.applyTrim(numeroCuenta);
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = TextHelper.applyTrim(contraseña);
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public AfiliadoDTO getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(AfiliadoDTO afiliado) {
		this.afiliado = ObjectHelper.getObjectHelper().getDefaultValue(afiliado,new AfiliadoDTO());
	}

	public TipoCuentaDTO getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuentaDTO tipoCuenta) {
		this.tipoCuenta = ObjectHelper.getObjectHelper().getDefaultValue(tipoCuenta, new TipoCuentaDTO());
	}
	
	

	
}
