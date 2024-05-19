package co.edu.uco.deviucopay.entity;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class CuentaEntity {
	
	private Long numeroCuenta;
	private Integer contraseña;
	private Float saldo;
	private AfiliadoEntity afiliado;
	private TipoCuentaEntity tipoCuenta;
	
	public CuentaEntity(Long numeroCuenta, Integer contraseña, Float saldo, AfiliadoEntity afiliado,TipoCuentaEntity tipoCuenta) {
		
		setNumeroCuenta(numeroCuenta);;
		setContraseña(contraseña);
		setSaldo(saldo);
		setAfiliado(afiliado);
		setTipoCuenta(tipoCuenta);
	}

	public Long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Long numeroCuenta) {
		this.numeroCuenta = LongHelper.getDefaultValue(numeroCuenta);
	}

	public Integer getContraseña() {
		return contraseña;
	}

	public void setContraseña(Integer contraseña) {
		this.contraseña = contraseña;
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
