package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;
	
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDelInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDelInteresDiario = porcentajeDelInteresDiario;
	}



	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}



	public double getMontoDepositado() {
		return montoDepositado;
	}



	public double getPorcentajeDelInteresDiario() {
		return porcentajeDelInteresDiario;
	}




	/*
	 * formula para el interes compuesto
	 * https://imgur.com/vf4tHxp.png
	 * 
	 * ejemplo: https://imgur.com/YowhCIS.png
	 */
	@Override
	public double valorActual() {
		LocalDate fechaActual = LocalDate.now();
		long diasTranscurridos = ChronoUnit.DAYS.between(fechaDeConstitucion, fechaActual);
		return this.montoDepositado * Math.pow(1+(porcentajeDelInteresDiario/100), diasTranscurridos);
	}
	
}
