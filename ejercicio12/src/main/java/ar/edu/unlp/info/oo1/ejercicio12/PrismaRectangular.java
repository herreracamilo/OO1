package ar.edu.unlp.info.oo1.ejercicio12;

public class PrismaRectangular extends Pieza{
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	
	public PrismaRectangular(String material,String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor= ladoMayor;
		this.ladoMenor= ladoMenor;
		this.altura= altura;
	}


	public int getLadoMayor() {
		return ladoMayor;
	}


	public int getLadoMenor() {
		return ladoMenor;
	}


	public int getAltura() {
		return altura;
	}


	@Override
	public double getVolumen() {
		return (getLadoMayor()*getLadoMenor()*getAltura());
	}


	@Override
	public double getSuperficie() {
		return (2*((getLadoMayor()*getLadoMenor())+(getLadoMayor()*getAltura())+(getLadoMenor()*getAltura())));
	}
	
	
}
