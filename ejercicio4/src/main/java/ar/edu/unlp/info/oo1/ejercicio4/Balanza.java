package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.ArrayList;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private ArrayList<Producto> listaProdu;
	
	
	public Balanza(){
		this.listaProdu = new ArrayList<>();
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}



	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}



	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}



	public double getPesoTotal() {
		return pesoTotal;
	}



	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}



	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.listaProdu.clear(); // limpia todos los elementos de la lista
	}
	
	
	public void agregarProducto (Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
		this.listaProdu.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket (this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
	}
	
	public ArrayList<Producto> getProductos(){
		return this.listaProdu;
	}
}
