package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;

public class Factura{
	private LocalDate fecha;
	private double montoFinal;
	private double descuentoAplicado;
	
	/*la factura tiene que imprimir los datos que tiene como propios nada mas
	 * no tiene que hacer calculos o cosas con if y eso
	 * tiene que ser simple
	 */
	
	public Factura(double montoFinal, double descuentoAplicado) {
		this.fecha = LocalDate.now();
		this.montoFinal = montoFinal;
		this.descuentoAplicado = descuentoAplicado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getMontoFinal() {
		return montoFinal;
	}

	public double getDescuentoAplicado() {
		return descuentoAplicado;
	}
	
// para test
	@Override
	public String toString() {
		return "Factura [fecha=" + this.fecha + ", montoFinal=" + this.montoFinal + ", descuentoAplicado=" + this.descuentoAplicado
				+ "]";
	}
	
	
}
