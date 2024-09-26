package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor implements Inversion {
	private String nombre;
	List<Inversion> inversiones;
	
	public String getNombre() {
		return nombre;
	}

	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion nueva) {
		this.inversiones.add(nueva);
	}

	@Override
	public double valorActual() {
		double valor =0;
		for(Inversion i : this.inversiones) {
			valor+= i.valorActual();
		}
		return valor;
	}
	
	
	
	
}
