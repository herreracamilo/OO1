package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private CuadroTarifario cuadro;
	
	public Usuario(String nombre, String domicilio, CuadroTarifario cuadro) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<Consumo>(); // tiene que ser en una coleccion
		this.cuadro = cuadro;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDomicilio() {
		return this.domicilio;
	}
	
	public double getCostoDeConsumo() {
		return (this.consumos.get(this.consumos.size() - 1).getConsumoEnergiaActiva() * this.cuadro.getPrecioDelKW());
	}
	
	public boolean obtieneBonificacion() {
		return (this.consumos.get(this.consumos.size() - 1).bonificacion());
	}
	
	public void agregarConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	public Factura emitirFactura() {
		double costo = this.getCostoDeConsumo();
		double descuento = 0;
		
		if(obtieneBonificacion()) {
			descuento = costo *  0.10;
			costo = costo - descuento;
		}
		return new Factura(costo, descuento);
	}

}
