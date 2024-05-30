package co.edu.uco.deviucopay.entity;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;

public class CuentaEntity {
	
	private String numeroCuenta;
	private String contraseña;
	private Float saldo;
	private AfiliadoEntity afiliado;
	private TipoCuentaEntity tipoCuenta;
	
	public CuentaEntity(String numeroCuenta, String contraseña, Float saldo, AfiliadoEntity afiliado,TipoCuentaEntity tipoCuenta) {
		
		setNumeroCuenta(numeroCuenta);;
		setContraseña(contraseña);
		setSaldo(saldo);
		setAfiliado(afiliado);
		setTipoCuenta(tipoCuenta);
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

	public AfiliadoEntity getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(AfiliadoEntity afiliado) {
		this.afiliado = ObjectHelper.getObjectHelper().getDefaultValue(afiliado,new AfiliadoEntity());
	}

	public TipoCuentaEntity getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuentaEntity tipoCuenta) {
		this.tipoCuenta = ObjectHelper.getObjectHelper().getDefaultValue(tipoCuenta, new TipoCuentaEntity());
	}
	
	

	
}
