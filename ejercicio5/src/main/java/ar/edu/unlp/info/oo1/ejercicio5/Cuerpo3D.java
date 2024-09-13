package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D {
	private Figura2D caraBasal;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Figura2D getCaraBasal() {
		return caraBasal;
	}
	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	// en estos que conviene hacer? getAltura o usar el this.altura PREGUNTAR
	// porque tambien hice algunos asi en cuadrado y circulo
	public double getVolumen() {
		return this.caraBasal.getArea() * getAltura();
	}
	
	// aca preguntar lo mismo de arriba
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * getAltura(); 
	}
}
