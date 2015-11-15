package com.itgam.power.rangers.model;

import java.sql.Timestamp;

public class ctHorario {

	private Integer iHorario;
	private Timestamp dtHoraInicio;
	private Timestamp dtHoraFin;
	private String cTurno;
	private Boolean lEstatus;
	private String cObs;
	
	public Integer getiHorario() {
		return iHorario;
	}
	public void setiHorario(Integer iHorario) {
		this.iHorario = iHorario;
	}
	public Timestamp getDtHoraInicio() {
		return dtHoraInicio;
	}
	public void setDtHoraInicio(Timestamp dtHoraInicio) {
		this.dtHoraInicio = dtHoraInicio;
	}
	public Timestamp getDtHoraFin() {
		return dtHoraFin;
	}
	public void setDtHoraFin(Timestamp dtHoraFin) {
		this.dtHoraFin = dtHoraFin;
	}
	public String getcTurno() {
		return cTurno;
	}
	public void setcTurno(String cTurno) {
		this.cTurno = cTurno;
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
