package com.spring.solicitudapi.models;

public class Solicitud {
	private Integer id;
	
	private String correo;
	
	private String tipo;
	
	private String motivo;
	
	private String captura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getCaptura() {
		return captura;
	}

	public void setCaptura(String captura) {
		this.captura = captura;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", correo=" + correo + ", tipo=" + tipo + ", motivo=" + motivo + ", captura="
				+ captura + "]";
	}
	
	
		
}
