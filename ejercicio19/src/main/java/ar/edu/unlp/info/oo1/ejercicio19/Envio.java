package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double pesoEnGramos;
	
	public Envio(LocalDate fechaDespacho,String direccionOrigen,String direccionDestino,double pesoEnGramos) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.pesoEnGramos = pesoEnGramos;
	}

	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}

	public String getDireccionOrigen() {
		return direccionOrigen;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public double getPesoEnGramos() {
		return pesoEnGramos;
	}
	
	public abstract double calcularPrecioEnvio();
	
}
