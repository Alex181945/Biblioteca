package com.itgam.power.rangers.model;

import java.sql.Timestamp;

public class dbPrestamo {

	private Integer iPrestamo;
	private Integer iLibro;
	private Timestamp dtFechaSalida;
	private Timestamp dtFechaEntrada;
	
	public Integer getiPrestamo() {
		return iPrestamo;
	}
	public void setiPrestamo(Integer iPrestamo) {
		this.iPrestamo = iPrestamo;
	}
	public Integer getiLibro() {
		return iLibro;
	}
	public void setiLibro(Integer iLibro) {
		this.iLibro = iLibro;
	}
	public Timestamp getDtFechaSalida() {
		return dtFechaSalida;
	}
	public void setDtFechaSalida(Timestamp dtFechaSalida) {
		this.dtFechaSalida = dtFechaSalida;
	}
	public Timestamp getDtFechaEntrada() {
		return dtFechaEntrada;
	}
	public void setDtFechaEntrada(Timestamp dtFechaEntrada) {
		this.dtFechaEntrada = dtFechaEntrada;
	}
	
}
