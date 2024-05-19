package co.edu.uco.deviucopay.entity;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class AfiliadoEntity {
	
	private UUID id;
	private Long numeroIdAfiliado;
	private String nombre;
	private String correo;
	private Long telefono;
	private TipoIdentificacionEntity tipoIdentificacion;
	private InstitucionEntity institucion;
	private CarnetEntity carnet;
	
	
	public AfiliadoEntity(UUID id, Long numeroIdAfiliado, String nombre, String correo, Long telefono,
			TipoIdentificacionEntity tipoIdentificacion, InstitucionEntity institucion, CarnetEntity carnet) {
		super();
		this.id = id;
		this.numeroIdAfiliado = numeroIdAfiliado;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.tipoIdentificacion = tipoIdentificacion;
		this.institucion = institucion;
		this.carnet = carnet;
	}

	
	public AfiliadoEntity() {
		super();
	}
	
	public static final AfiliadoEntity build() {
		return new AfiliadoEntity();
	}

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = UUIDHelper.obtenerValorDefecto(id);
	}


	public Long getNumeroIdAfiliado() {
		return numeroIdAfiliado;
	}


	public void setNumeroIdAfiliado(Long numeroIdAfiliado) {
		this.numeroIdAfiliado = LongHelper.getDefaultValue(numeroIdAfiliado);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = TextHelper.applyTrim(nombre);
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = TextHelper.applyTrim(correo);
	}


	public Long getTelefono() {
		return telefono;
	}


	public void setTelefono(Long telefono) {
		this.telefono = LongHelper.getDefaultValue(telefono);
	}


	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = ObjectHelper.getObjectHelper().getDefaultValue(tipoIdentificacion,new TipoIdentificacionDTO());
	}


	public InstitucionEntity getInstitucion() {
		return institucion;
	}


	public void setInstitucion(InstitucionEntity institucion) {
		this.institucion =  ObjectHelper.getObjectHelper().getDefaultValue(institucion,new InstitucionEntity());
	}


	public CarnetEntity getCarnet() {
		return carnet;
	}


	public void setCarnet(CarnetEntity carnet) {
		this.carnet =  ObjectHelper.getObjectHelper().getDefaultValue(carnet, new CarnetEntity());
	}
	
	
	
	
	

}
