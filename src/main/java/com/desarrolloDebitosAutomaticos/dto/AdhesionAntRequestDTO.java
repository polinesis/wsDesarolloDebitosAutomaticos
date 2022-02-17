package com.desarrolloDebitosAutomaticos.dto;

public class AdhesionAntRequestDTO {
	
	private String  descripcion;
	private String  email;
	private String  amount;
	private String  nro_plan;

	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getNro_plan() {
		return nro_plan;
	}
	public void setNro_plan(String nro_plan) {
		this.nro_plan = nro_plan;
	}
	
	
	
	

}
