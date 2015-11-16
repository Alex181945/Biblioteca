package com.itgam.power.rangers.model;

public class prPrestamos {

	private Integer iPrestamo;
	private Integer iPersonal;
	private Integer iUsuario;
	private Boolean lEstatus;
	private String cObs;
	
	public Integer getiPrestamo() {
		return iPrestamo;
	}
	public void setiPrestamo(Integer iPrestamo) {
		this.iPrestamo = iPrestamo;
	}
	public Integer getiPersonal() {
		return iPersonal;
	}
	public void setiPersonal(Integer iPersonal) {
		this.iPersonal = iPersonal;
	}
	public Integer getiUsuario() {
		return iUsuario;
	}
	public void setiUsuario(Integer iUsuario) {
		this.iUsuario = iUsuario;
	}
	public Boolean getlEstatus() {
		return lEstatus;
	}
	public void setlEstatus(Boolean lEstatus) {
		this.lEstatus = lEstatus;
	}
	public String getcObs() {
		return cObs;
	}
	public void setcObs(String cObs) {
		this.cObs = cObs;
	}
	
}
