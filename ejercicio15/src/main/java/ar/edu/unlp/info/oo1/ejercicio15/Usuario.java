package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String nombre;
	private String domicilio;
	private List<Factura> facturas;
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	/*
	 * el usuario es el que tiene que calcular costo
	 * y determinar si tiene bonificacion o no
	 * ARREGLAR!!!!!!!!!
	 */
	
	public double getCostoDeConsumo() {
		return (getConsumoEnergiaActiva()* getCostoDeConsumo());
	}
	
	public boolean obtieneBonificacion() {
		return (factorDePotencia()>0.8);
	}
	
	
	

}
