package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email{
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.archivos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return this.archivos;
	}
	
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
	public int tamanoTotal() {
		int tamanoTitulo = this.titulo.length();
		int tamanoCuerpo = this.cuerpo.length();
		int suma= tamanoCuerpo + tamanoTitulo;
		for(Archivo a : this.archivos) {
			suma+= a.tamano();
		}
		return (suma);
	}
	
}
