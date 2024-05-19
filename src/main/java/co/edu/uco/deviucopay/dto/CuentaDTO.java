package co.edu.uco.deviucopay.dto;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;

public class CuentaDTO {
	
	private Long numeroCuenta;
	private Integer contraseña;
	private Float saldo;
	private AfiliadoDTO afiliado;
	private TipoCuentaDTO tipoCuenta;
	
	public CuentaDTO(Long numeroCuenta, Integer contraseña, Float saldo, AfiliadoDTO afiliado,TipoCuentaDTO tipoCuenta) {
		
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
