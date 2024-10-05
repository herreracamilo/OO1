package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta{
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre= nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		if(this.emails.contains(email)) {
			this.emails.remove(email);
			destino.agregarEmail(email);
		}
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public Email buscaEmail(String texto) {
		for (Email e : this.emails) {
			if(e.contiene(texto)) {
				return e;
			}
		}
		return null;
	}
	
	public int espacioCarpetas() {
		int suma =0;
		for(Email e : emails) {
			suma+= e.tamanoTotal();
		}
		return suma;
	}
}
