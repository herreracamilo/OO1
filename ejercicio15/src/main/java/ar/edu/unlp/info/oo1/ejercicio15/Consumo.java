package ar.edu.unlp.info.oo1.ejercicio15;

public class Consumo{
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(double energiaActiva, double energiaReactiva) {
		this.consumoEnergiaActiva = energiaActiva;
		this.consumoEnergiaReactiva = energiaReactiva;
	}
	
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}
	
	// devuelvo lo que gastó neto
	
	
	public double factorDePotencia() {
	    return getConsumoEnergiaActiva() / 
	           Math.sqrt(Math.pow(getConsumoEnergiaActiva(), 2) + 
	                     Math.pow(getConsumoEnergiaReactiva(), 2));
	}
	
	public boolean bonificacion() {
		return (factorDePotencia()>0.8);
	}
	
}
