package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private double costoFijo = 5000;
	public EnvioInternacional(LocalDate fechaDespacho,String direccionOrigen,String direccionDestino,double pesoEnGramos) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
	}
	
	public double getCostoFijo() {
		return costoFijo;
	}

	@Override
	public double calcularPrecioEnvio() {
		double peso = this.getPesoEnGramos();
		if(peso <= 1000) {
			return (10 * peso) + this.getCostoFijo();
		} else return (12 * peso) + this.getCostoFijo();
	}
}
