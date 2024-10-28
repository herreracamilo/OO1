package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double distanciaEnKM;
	public EnvioInterurbano(LocalDate fechaDespacho,String direccionOrigen,String direccionDestino,double pesoEnGramos, double distanciaEnKM) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
		this.distanciaEnKM = distanciaEnKM;
	}
	public double getDistanciaEnKM() {
		return distanciaEnKM;
	}
	
	
	@Override
	public double calcularPrecioEnvio() {
		double distancia = this.getDistanciaEnKM();
		double costoPorGramo;
		if(distancia < 100) {
			costoPorGramo = 20;
		}else if(distancia <=500) {
			costoPorGramo = 25;
		}else {
			costoPorGramo = 30;
		}
		return this.getPesoEnGramos() * costoPorGramo;
	}
	
}
