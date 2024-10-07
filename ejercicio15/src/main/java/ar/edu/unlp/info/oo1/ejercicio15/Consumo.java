package ar.edu.unlp.info.oo1.ejercicio15;

public class Consumo extends CuadroTarifario{
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	private double costoDeConsumo;
	
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
	
	
	private double factorDePotencia() {
		return (getConsumoEnergiaActiva() / (Math.sqrt((Math.pow(2, getConsumoEnergiaActiva()))+(Math.pow(2, getConsumoEnergiaReactiva())))));
	}
	
	
}
