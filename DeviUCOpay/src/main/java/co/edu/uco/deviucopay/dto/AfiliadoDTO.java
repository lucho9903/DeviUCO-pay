package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class AfiliadoDTO {
	
	private UUID id;
	private Long numeroIdAfiliado;
	private String nombre;
	private String correo;
	private Long telefono;
	private TipoIdentificacionDTO tipoIdentificacion;
	private InstitucionDTO institucion;
	private CarnetDTO carnet;
	
	
	public AfiliadoDTO(UUID id, Long numeroIdAfiliado, String nombre, String correo, Long telefono,
			TipoIdentificacionDTO tipoIdentificacion, InstitucionDTO institucion, CarnetDTO carnet) {
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

	
	public AfiliadoDTO() {
		super();
	}
	
	public static final AfiliadoDTO build() {
		return new AfiliadoDTO();
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


	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = ObjectHelper.getObjectHelper().getDefaultValue(tipoIdentificacion,new TipoIdentificacionDTO());
	}


	public InstitucionDTO getInstitucion() {
		return institucion;
	}


	public void setInstitucion(InstitucionDTO institucion) {
		this.institucion =  ObjectHelper.getObjectHelper().getDefaultValue(institucion,new InstitucionDTO());
	}


	public CarnetDTO getCarnet() {
		return carnet;
	}


	public void setCarnet(CarnetDTO carnet) {
		this.carnet =  ObjectHelper.getObjectHelper().getDefaultValue(carnet, new CarnetDTO());
	}
	
	
	
	
	

}
