package ar.edu.unlp.info.oo1.ejercicio15;


public class Usuario {
	
	private String nombre;
	private String domicilio;
	private Consumo consumo;
	private CuadroTarifario cuadro;
	
	public Usuario(String nombre, String domicilio, Consumo consumo, CuadroTarifario cuadro) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumo = consumo;
		this.cuadro = cuadro;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDomicilio() {
		return this.domicilio;
	}
	
	public double getCostoDeConsumo() {
		return (this.consumo.getConsumoEnergiaActiva() * this.cuadro.getPrecioDelKW());
	}
	
	public boolean obtieneBonificacion() {
		return (this.consumo.factorDePotencia()>0.8);
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
