package co.edu.uco.deviucopay.dto;

import java.util.UUID;

import co.edu.uco.deviucopay.crosscutting.helpers.LongHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.ObjectHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.TextHelper;
import co.edu.uco.deviucopay.crosscutting.helpers.UUIDHelper;

public class AfiliadoDTO {
	
	private UUID id;
	private String numeroIdAfiliado;
	private String nombre;
	private String correo;
	private String telefono;
	private TipoIdentificacionDTO tipoIdentificacion;
	private InstitucionDTO institucion;
	private CarnetDTO carnet;
	
	
	public AfiliadoDTO(UUID id, String numeroIdAfiliado, String nombre, String correo, String telefono,
			TipoIdentificacionDTO tipoIdentificacion, InstitucionDTO institucion, CarnetDTO carnet) {
		
		setId (id);
		setNumeroIdAfiliado (numeroIdAfiliado);
		setNombre(nombre);
		setCorreo(correo);
		setTelefono(telefono);
		setTipoIdentificacion (tipoIdentificacion);
		setInstitucion(institucion);
		setCarnet (carnet);
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
		this.id = UUIDHelper.getDefault();
	}


	public String getNumeroIdAfiliado() {
		return numeroIdAfiliado;
	}


	public void setNumeroIdAfiliado(String numeroIdAfiliado) {
		this.numeroIdAfiliado = TextHelper.applyTrim(numeroIdAfiliado);
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = TextHelper.applyTrim(telefono);
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
