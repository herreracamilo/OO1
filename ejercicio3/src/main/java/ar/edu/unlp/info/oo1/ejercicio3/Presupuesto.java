package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto(String cliente) {
        this.items = new ArrayList<>();
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.fecha = LocalDate.now();
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0.0;
		// voy a recorrer la lista con un for each
		for(Item item : items) {
			total += item.costo();
		}
		return total;
	}
	
}
