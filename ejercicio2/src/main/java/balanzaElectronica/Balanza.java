package balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	
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
	}
	
	
	public void agregarProducto (Producto producto) {
		
	}
	
}
