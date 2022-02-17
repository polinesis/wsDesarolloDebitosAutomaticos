package com.desarrolloDebitosAutomaticos.dto;

public class AdhesionRequestDTO {
	private String  objeto;
	private String  tipoObjeto;
	private String  cuit;
	private String  idPpt;
	private String  fechaAlta; //('YYYY-MM-DD HH:MM:SS') 
	private String  fechaBaja; //('YYYY-MM-DD HH:MM:SS') 
	private String  pServicio;
		
	public AdhesionRequestDTO(String objeto, String tipoObjeto) {
		this.objeto = objeto;
		this.tipoObjeto = tipoObjeto;
	}
	
	

	public String getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

	

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}



	public String getObjeto() {
		return objeto;
	}



	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}



	public String getIdPpt() {
		return idPpt;
	}



	public void setIdPpt(String idPpt) {
		this.idPpt = idPpt;
	}



	public String getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public String getFechaBaja() {
		return fechaBaja;
	}



	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}



	public String getpServicio() {
		return pServicio;
	}



	public void setpServicio(String pServicio) {
		this.pServicio = pServicio;
	}
	
	
	
	

}

