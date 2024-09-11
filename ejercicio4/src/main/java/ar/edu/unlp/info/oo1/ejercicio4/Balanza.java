package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;

public class Balanza {
	private ArrayList<Producto> listaProdu;
	
	
	public Balanza(){
		this.listaProdu = new ArrayList<>();
	}
	
	public int getCantidadDeProductos() {
		return this.listaProdu.size();
	}



	/* recorro 1 sola vez la coleccion y saco precio y peso total preguntar
	public void getPrecioTotalyPesoTotal() {
		for (Producto produ : listaProdu){
			this.precioTotal+=produ.getPrecio();
			this.pesoTotal+=produ.getPeso();
		}

	}
	*/
	
	public void ponerEnCero() {
		this.listaProdu.clear(); // limpia todos los elementos de la lista
	}
	
	
	public void agregarProducto (Producto producto) {
		this.listaProdu.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket (this.listaProdu.size(),getPesoTotal(),getPrecioTotal());
	}
	
	public ArrayList<Producto> getProductos(){
		return this.listaProdu;
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0.0;
		for (Producto produ : listaProdu){
			precioTotal+=produ.getPrecio();
		}
		return precioTotal;
	}
	
	public double getPesoTotal() {
		double pesoTotal = 0.0;
		for (Producto produ : listaProdu){
			pesoTotal+=produ.getPeso();
		}
		return pesoTotal;
	}
}
