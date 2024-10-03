package ar.edu.unlp.info.oo1.ejercicio13;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamano() {
		return this.nombre.length();
	}
}
