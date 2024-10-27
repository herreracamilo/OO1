package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private DateLapse fecha;
	private int cantidadNoches;
	private Propiedad propiedad;
	
	
	public Reserva(LocalDate fechaInicial, LocalDate fechaFinal, Propiedad propiedad) {
		this.fecha = new DateLapse(fechaInicial, fechaFinal);
		this.cantidadNoches = (int) ChronoUnit.DAYS.between(fechaInicial, fechaFinal); // calculo la cantidad de noches
		this.propiedad = propiedad;
	}



	public DateLapse getFecha() {
		return fecha;
	}


	public int getCantidadNoches() {
		return cantidadNoches;
	}


	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public double calcularPrecio() {
		return getCantidadNoches()*getPropiedad().getPrecioPorNoche();
	}
	
	public boolean puedeCancelar(LocalDate hoy) {
		return this.fecha.getFrom().isAfter(hoy);
	}
	
	
	
}
