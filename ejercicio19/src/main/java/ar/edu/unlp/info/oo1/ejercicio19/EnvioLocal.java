package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private double costoFijoEstandar = 100;
	private double costoAdicionalRapido = 500;
	private boolean esEntregaRapida;
	
	public EnvioLocal(LocalDate fechaDespacho,String direccionOrigen,String direccionDestino,double pesoEnGramos, boolean esEntregaRapida) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoEnGramos);
		this.esEntregaRapida = esEntregaRapida;
	}

	public double getCostoFijoEstandar() {
		return costoFijoEstandar;
	}

	public double getCostoAdicionalRapido() {
		return costoAdicionalRapido;
	}

	public boolean esEntregaRapida() {
		return esEntregaRapida;
	}

	@Override
	public double calcularPrecioEnvio() {
		if(esEntregaRapida()) {
			return this.getCostoFijoEstandar()+this.getCostoAdicionalRapido();	
		}
		else return this.getCostoFijoEstandar();
	}
	
	
}
