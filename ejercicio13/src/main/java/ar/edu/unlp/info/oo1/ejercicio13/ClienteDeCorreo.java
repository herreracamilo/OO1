package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo{
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		agregarCarpeta(inbox);
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		for(Carpeta c : this.carpetas) {
			Email encontrado = c.buscaEmail(texto);
			if(encontrado != null) {
				return encontrado;
			}
		}
		return null;
	}
	
	public int espacioOcupado() {
		int suma =0;
		for(Carpeta c : carpetas) {
			suma+= c.espacioCarpetas();
		}
		return suma;
	}
	
	/*
	 *  preguntar el metodo de abajo si es necesario o como solucionarlo
	 *  porque como hago para mover emails desde el inbox sino?
	 */
	
	public void moverDesdeInbox(Email email, Carpeta destino) {
		if(email != null && destino != null) {
			this.inbox.mover(email, destino);
		}
	}
}
