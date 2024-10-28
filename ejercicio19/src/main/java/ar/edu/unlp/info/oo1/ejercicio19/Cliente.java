package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public Cliente(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Envio> getEnvios() {
		return envios;
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double calcularMontoEnPeriodo(DateLapse periodo) {
		double total = this.envios.stream()
				.filter(envio -> periodo.includesDate(envio.getFechaDespacho()))
				.mapToDouble(Envio::calcularPrecioEnvio)
				.sum();
		if(this instanceof PersonaFisica) {
			total*=0.9;
		}
		return total;
	}
	
	
}
