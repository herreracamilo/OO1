package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado implements Figura2D{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return 4 * getLado();
	}
	
	public double getArea() {
		return Math.pow(getLado(), 2);
	}
}
