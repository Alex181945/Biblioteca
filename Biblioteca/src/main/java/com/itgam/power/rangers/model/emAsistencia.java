package com.itgam.power.rangers.model;

import java.sql.Timestamp;

public class emAsistencia {

	private Integer iAsistencia;
	private Integer iPersonal;
	private Timestamp dtHoraEntrada;
	private Boolean lEstatus;
	private String cObs;
	
	public Integer getiAsistencia() {
		return iAsistencia;
	}
	public void setiAsistencia(Integer iAsistencia) {
		this.iAsistencia = iAsistencia;
	}
	public Integer getiPersonal() {
		return iPersonal;
	}
	public void setiPersonal(Integer iPersonal) {
		this.iPersonal = iPersonal;
	}
	public Timestamp getDtHoraEntrada() {
		return dtHoraEntrada;
	}
	public void setDtHoraEntrada(Timestamp dtHoraEntrada) {
		this.dtHoraEntrada = dtHoraEntrada;
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
